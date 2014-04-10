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

    public VerbalExpression() {
    }

    /**
     *
     */
    public static class Builder {

        private String prefixes = "", source = "", suffixes = "";
        private Pattern pattern;
        private int modifiers = Pattern.MULTILINE;

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
         *
         * @param pValue <code></code>
         * @return <code></code>
         */
        public Builder add(String pValue) {
            this.source += pValue;
            return this;
        }

        /**
         *
         * @return <code></code>
         */
        public VerbalExpression build() {
            pattern = Pattern.compile(this.prefixes + this.source + this.suffixes, this.modifiers);
            return new VerbalExpression(this);
        }

        /**
         *
         * @param pEnable
         * @return <code></code>
         */
        public Builder startOfLine(boolean pEnable) {
            this.prefixes = pEnable ? "^" : "";
            return this;
        }

        /**
         *
         * @return <code></code>
         */
        public Builder startOfLine() {
            return startOfLine(true);
        }

        /**
         *
         * @param pEnable
         * @return <code></code>
         */
        public Builder endOfLine(final boolean pEnable) {
            this.suffixes = pEnable ? "$" : "";
            return this;
        }

        /**
         *
         * @return <code></code>
         */
        public Builder endOfLine() {
            return endOfLine(true);
        }

        /**
         *
         * @param pValue <code></code>
         * @return <code></code>
         */
        public Builder then(String pValue) {
            this.add("(" + sanitize(pValue) + ")");
            return this;
        }

        /**
         *
         * @param value
         * @return <code></code>
         */
        public Builder find(String value) {
            this.then(value);
            return this;
        }

        /**
         *
         * @param pValue <code></code>
         * @return <code></code>
         */
        public Builder maybe(final String pValue) {
            this.add("(" + sanitize(pValue) + ")?");
            return this;
        }

        /**
         * Quaquer coisa
         *
         * @return <code>Builder</code>
         */
        public Builder anything() {
            this.add("(.*)");
            return this;
        }

        /**
         *
         * @param pValue <code></code>
         * @return <code>Builder</code>
         */
        public Builder anythingButNot(final String pValue) {
            this.add("([^" + sanitize(pValue) + "]*)");
            return this;
        }

        /**
         *
         * @return <code>Builder</code>
         */
        public Builder something() {
            this.add("(.+)");
            return this;
        }

        /**
         *
         * @param pValue <code></code>
         * @return <code>Builder</code>
         */
        public Builder somethingButNot(final String pValue) {
            this.add("([^" + sanitize(pValue) + "]+)");
            return this;
        }

        /**
         *
         * @return <code>Builder</code>
         */
        public Builder lineBreak() {
            this.add("(\\n|(\\r\\n))");
            return this;
        }

        /**
         *
         * @return <code>Builder</code>
         */
        public Builder br() {
            this.lineBreak();
            return this;
        }

        /**
         *
         * @return <code>Builder</code>
         */
        public Builder tab() {
            this.add("\\t");
            return this;
        }

        /**
         *
         * @return <code>Builder</code>
         */
        public Builder word() {
            this.add("\\w+");
            return this;
        }

        /**
         *
         * @param pValue <code></code> <code></code>
         * @return <code>Builder</code>
         */
        public Builder anyOf(final String pValue) {
            this.add("[" + sanitize(pValue) + "]");
            return this;
        }

        /**
         *
         * @param value <code></code>
         * @return <code>Builder</code>
         */
        public Builder any(final String value) {
            this.anyOf(value);
            return this;
        }

        /**
         *
         * @param pArgs <code></code>
         * @return <code>Builder</code>
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
         *
         * @param pModifier <code></code>
         * @return <code>Builder</code>
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
         *
         * @param pModifier <code></code>
         * @return <code>Builder</code>
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
         *
         * @param pEnable <code></code>
         * @return <code>Builder</code>
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
         *
         * @return <code>Builder</code>
         */
        public Builder withAnyCase() {
            return withAnyCase(true);
        }

        /**
         *
         * @param pEnable <code></code>
         * @return <code>Builder</code>
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
         *
         * @param pValue <code></code> <code></code>
         * @return <code>Builder</code>
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
         *
         * @param pValue <code></code> <code></code>
         * @return <code>Builder</code>
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

        public Pattern getPattern() {
            return pattern;
        }

        public void setPattern(Pattern pattern) {
            this.pattern = pattern;
        }

    }

    /*
     * @param pToTest <code></code>
     * @return <code>Builder</code>
     */
    public boolean testExact(final String pToTest) {
        boolean ret = false;
        if (pToTest != null) {
            ret = pattern.matcher(pToTest).matches();
        }
        return ret;
    }

    /**
     *
     * @param pToTest <code></code>
     * @return <code>Builder</code>
     */
    public boolean test(final String pToTest) {
        boolean ret = false;
        if (pToTest != null) {
            ret = pattern.matcher(pToTest).find();
        }
        return ret;
    }

    /**
     *
     * @param pBuilder <code></code>
     */
    private VerbalExpression(final Builder pBuilder) {
        pattern = pBuilder.getPattern();
    }

    /**
     * Retorna texto
     *
     * @param toTest <code></code>
     * @return <code>String</code>
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

    public Builder getBuilder() {
        return new Builder();
    }

}
