package br.com.gmp.utils.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validador de expressões verbais
 *
 * @author ionutvmi
 * @version 1.0
 * @author kaciano
 * @version 1.1
 */
public class VerbalExpression {

    private Pattern pattern;

    /**
     * Cria novo VerbalExpression
     */
    public VerbalExpression() {
    }

    /**
     * Classe construtora
     */
    public static class Builder {

        private String prefixes = "", source = "", suffixes = "";
        private Pattern pattern;
        private int modifiers = Pattern.MULTILINE;

        /**
         * Constroi os dados
         *
         * @param {@code String} Valor
         * @return {@code String} Sanitização dos valores
         */
        private String sanitize(final String pValue) {
            Matcher matcher = Pattern.compile("").matcher("").usePattern(Pattern.compile("[^\\w]"));
            int lastEnd = 0;
            String result = "";
            matcher.reset(pValue);
            boolean matcherCalled = false;
            while (matcher.find()) {
                matcherCalled = true;
                if (matcher.start() != lastEnd) {
                    result += pValue.substring(lastEnd, matcher.start());
                }
                result += "\\" + pValue.substring(matcher.start(), matcher.end());
                lastEnd = matcher.end();
            }
            if (!matcherCalled) {
                return pValue;
            }
            return result;
        }

        /**
         * Adiciona
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder add(String pValue) {
            this.source += pValue;
            return this;
        }

        /**
         * Inicia a construção
         *
         * @return {@code VerbalExpression}
         */
        public VerbalExpression build() {
            pattern = Pattern.compile(this.prefixes + this.source + this.suffixes, this.modifiers);
            return new VerbalExpression(this);
        }

        /**
         * Começo da linha
         *
         * @param pEnable {@code boolean} Permitir
         * @return {@code Builder}
         */
        public Builder startOfLine(boolean pEnable) {
            this.prefixes = pEnable ? "^" : "";
            return this;
        }

        /**
         * Começo da linha
         *
         * @return {@code Builder}
         */
        public Builder startOfLine() {
            return startOfLine(true);
        }

        /**
         * Fim da linha
         *
         * @param pEnable {@code boolean} Permitir
         * @return {@code Builder}
         */
        public Builder endOfLine(final boolean pEnable) {
            this.suffixes = pEnable ? "$" : "";
            return this;
        }

        /**
         *
         * @return {@code Builder}
         */
        public Builder endOfLine() {
            return endOfLine(true);
        }

        /**
         * Então...
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder then(String pValue) {
            this.add("(" + sanitize(pValue) + ")");
            return this;
        }

        /**
         *
         * @param value {@code String} Valor
         * @return {@code Builder}
         */
        public Builder find(String value) {
            this.then(value);
            return this;
        }

        /**
         * Talvez
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder maybe(final String pValue) {
            this.add("(" + sanitize(pValue) + ")?");
            return this;
        }

        /**
         * Quaquer coisa
         *
         * @return {@code Builder}
         */
        public Builder anything() {
            this.add("(.*)");
            return this;
        }

        /**
         * Qualquer coisa, exceto...
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder anythingButNot(final String pValue) {
            this.add("([^" + sanitize(pValue) + "]*)");
            return this;
        }

        /**
         * Alguma coisa...
         *
         * @return {@code Builder}
         */
        public Builder something() {
            this.add("(.+)");
            return this;
        }

        /**
         * Alguma coisa mas não...
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder somethingButNot(final String pValue) {
            this.add("([^" + sanitize(pValue) + "]+)");
            return this;
        }

        /**
         * Quebra de linha
         *
         * @return {@code Builder}
         */
        public Builder lineBreak() {
            this.add("(\\n|(\\r\\n))");
            return this;
        }

        /**
         * Quebra de linha
         *
         * @return {@code Builder}
         */
        public Builder br() {
            this.lineBreak();
            return this;
        }

        /**
         * Tabulação
         *
         * @return {@code Builder}
         */
        public Builder tab() {
            this.add("\\t");
            return this;
        }

        /**
         * Palavra
         *
         * @return {@code Builder}
         */
        public Builder word() {
            this.add("\\w+");
            return this;
        }

        /**
         * Qualquer um entre
         *
         * @param pValue {@code String} Valor
         * @return {@code Builder}
         */
        public Builder anyOf(final String pValue) {
            this.add("[" + sanitize(pValue) + "]");
            return this;
        }

        /**
         * Qualquer
         *
         * @param value {@code String} Valor
         * @return {@code Builder}
         */
        public Builder any(final String value) {
            this.anyOf(value);
            return this;
        }

        /**
         * Comprimento
         *
         * @param pArgs {@code String[]} Argumentos
         * @return {@code Builder}
         */
        public Builder range(String... pArgs) {
            String value = "[";
            for (int _to = 1; _to < pArgs.length; _to += 2) {
                String from = sanitize((String) pArgs[_to - 1]);
                String to = sanitize((String) pArgs[_to]);

                value += from + "-" + to;
            }
            value += "]";

            this.add(value);
            return this;
        }

        /**
         * Adiciona modificador
         *
         * @param pModifier {@code char} Modificador
         * @return {@code Builder}
         */
        public Builder addModifier(final char pModifier) {
            switch (pModifier) {
                case 'd':
                    modifiers |= Pattern.UNIX_LINES;
                    break;
                case 'i':
                    modifiers |= Pattern.CASE_INSENSITIVE;
                    break;
                case 'x':
                    modifiers |= Pattern.COMMENTS;
                    break;
                case 'm':
                    modifiers |= Pattern.MULTILINE;
                    break;
                case 's':
                    modifiers |= Pattern.DOTALL;
                    break;
                case 'u':
                    modifiers |= Pattern.UNICODE_CASE;
                    break;
                case 'U':
                    modifiers |= Pattern.UNICODE_CHARACTER_CLASS;
                    break;
                default:
                    break;
            }

            return this;
        }

        /**
         * Remove modificador
         *
         * @param pModifier {@code char} Modificador
         * @return {@code Builder}
         */
        public Builder removeModifier(final char pModifier) {
            switch (pModifier) {
                case 'd':
                    modifiers ^= Pattern.UNIX_LINES;
                    break;
                case 'i':
                    modifiers ^= Pattern.CASE_INSENSITIVE;
                    break;
                case 'x':
                    modifiers ^= Pattern.COMMENTS;
                    break;
                case 'm':
                    modifiers ^= Pattern.MULTILINE;
                    break;
                case 's':
                    modifiers ^= Pattern.DOTALL;
                    break;
                case 'u':
                    modifiers ^= Pattern.UNICODE_CASE;
                    break;
                case 'U':
                    modifiers ^= Pattern.UNICODE_CHARACTER_CLASS;
                    break;
                default:
                    break;
            }

            return this;
        }

        /**
         * Com qualquer tamanho (maiusculo, minusculo)
         *
         * @param pEnable {@code boolean}
         * @return {@code Builder}
         */
        public Builder withAnyCase(boolean pEnable) {
            if (pEnable) {
                this.addModifier('i');
            } else {
                this.removeModifier('i');
            }
            return this;
        }

        /**
         * Com qualquer tamanho (maiusculo, minusculo)
         *
         * @return {@code Builder}
         */
        public Builder withAnyCase() {
            return withAnyCase(true);
        }

        /**
         * Procura por um
         *
         * @param pEnable {@code boolean}
         * @return {@code Builder}
         */
        public Builder searchOneLine(boolean pEnable) {
            if (pEnable) {
                this.removeModifier('m');
            } else {
                this.addModifier('m');
            }
            return this;
        }

        /**
         * Multiplo
         *
         * @param pValue {@code String}
         * @return {@code Builder}
         */
        public Builder multiple(final String pValue) {
            String value = this.sanitize(pValue);
            switch (value.charAt(0)) {
                case '*':
                case '+':
                    break;
                default:
                    value += '+';
            }
            this.add(value);
            return this;
        }

        /**
         * Ou
         *
         * @param pValue {@code String}
         * @return {@code Builder}
         */
        public Builder or(final String pValue) {
            if (this.prefixes.indexOf("(") == -1) {
                this.prefixes += "(";
            }
            if (this.suffixes.indexOf(")") == -1) {
                this.suffixes = ")" + this.suffixes;
            }

            this.add(")|(");
            if (pValue != null) {
                this.then(pValue);
            }
            return this;
        }

        /**
         * Retorna o Pattern
         *
         * @return {@code Pattern}
         */
        public Pattern getPattern() {
            return pattern;
        }

        /**
         * Modifica o Pattern
         *
         * @param pattern {@code Pattern}
         */
        public void setPattern(Pattern pattern) {
            this.pattern = pattern;
        }

    }

    /**
     * Testa a String
     *
     * @param pToTest {@code String}
     * @return {@code Builder}
     */
    public boolean testExact(final String pToTest) {
        boolean ret = false;
        if (pToTest != null) {
            ret = pattern.matcher(pToTest).matches();
        }
        return ret;
    }

    /**
     * Testa a String
     *
     * @param pToTest {@code String}
     * @return {@code Builder}
     */
    public boolean test(final String pToTest) {
        boolean ret = false;
        if (pToTest != null) {
            ret = pattern.matcher(pToTest).find();
        }
        return ret;
    }

    /**
     * Cria nova instancia pridava de VerbalExpression
     *
     * @param pBuilder {@code Builder}
     */
    private VerbalExpression(final Builder pBuilder) {
        pattern = pBuilder.getPattern();
    }

    /**
     * Retorna texto
     *
     * @param toTest {@code String}
     * @return {@code String}
     */
    public String getText(String toTest) {
        Matcher m = pattern.matcher(toTest);
        StringBuilder result = new StringBuilder();
        while (m.find()) {
            result.append(m.group());
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return pattern.pattern();
    }

    /**
     * Retorna o construtor
     *
     * @return {@code Builder}
     */
    public Builder getBuilder() {
        return new Builder();
    }

}
