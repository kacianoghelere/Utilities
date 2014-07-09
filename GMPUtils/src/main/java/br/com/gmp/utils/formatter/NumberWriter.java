package br.com.gmp.utils.formatter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

/**
 * Objeto utilitario para descrever numeros em forma de texto
 *
 * @author kaciano
 * @version 1.0
 */
public class NumberWriter {

    private static final BigInteger THOUSAND = new BigInteger("1000");
    private static final BigInteger HUNDRED = new BigInteger("100");
    private static final String HUNDRED_PLURAL = "CENTO";
    private static final String HUNDRED_SINGLE = "CEM";

    private final Map<Integer, String> pluralGreatness = new HashMap<>();
    private final Map<Integer, String> sigleGreatness = new HashMap<>();

    /**
     * Nomes dos números.
     */
    private final Map<Integer, String> nomes = new HashMap<>();

    private static final String COIN_SINGLE = "REAL";
    private static final String COIN_PLURAL = "REAIS";

    private static final String FRACTION_SINGULAR = "CENTAVO";
    private static final String FRACTION_PLURAL = "CENTAVOS";

    private static final String ADTIVE_PARTICLE = "E";
    private static final String DESCRITIVE_PARTICLE = "DE";

    /**
     * O conversor reconhece números até a ordem dos setilhões, portanto, o
     * maior valor suportado atualmente é o representado abaixo.
     */
    private static final BigDecimal MAX_SUPPORTED_VALUE = new BigDecimal("999999999999999999999999999.99");

    /**
     * Cria nova instancia de NumberWriter
     */
    public NumberWriter() {
        fillPluralGreatness();
        fillSingleGreatness();
        fillNames();
    }

    /**
     * Analisa o numero recebido e retorna a descrição
     *
     * @param amount {@code BigDecimal} Valor a ser descrito
     * @param currency {@code boolean} O valor é uma moeda?
     * @return {@code String} Descrição do valor
     */
    public String write(final BigDecimal amount, boolean currency) {
        if (null == amount) {
            throw new IllegalArgumentException();
        }
        /*
         * TODO substituir o método setScale, abaixo, pela versão cujo
         * parâmetro de arredondamento é um enum
         */
        BigDecimal value = amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            return "";
        }
        if (MAX_SUPPORTED_VALUE.compareTo(value) < 0) {
            throw new IllegalArgumentException("Valor acima do limite suportado.");
        }
        Stack<Integer> decomposed = decompose(value);
        /* Se o número estiver, digamos, na casa dos milhões, a pilha 
         * deverá conter 4 elementos sendo os dois últimos os das 
         * centenas e dos centavos, respectivamente. Assim, o expoente de
         * dez que representa a grandeza no topo da pilha é o número de 
         * (elementos - 2) * 3 */
        int exponent = 3 * (decomposed.size() - 2); // TODO usar um índice de grupos ao invés do expoente 
        StringBuilder sb = new StringBuilder();
        int lastNonZeroExponent = -1;
        while (!decomposed.empty()) {
            int value2 = decomposed.pop();
            if (value2 > 0) {
                sb.append(" ").append(ADTIVE_PARTICLE).append(" ");
                sb.append(buildGroupNames(value2));
                String greatnessName = getGreatnessName(exponent, value2);
                if (greatnessName.length() > 0) {
                    sb.append(" ");
                }
                sb.append(greatnessName);

                lastNonZeroExponent = exponent;
            }
            switch (exponent) { // TODO ao invés desses switches e ifs, partir para a idéia das "Pendências"; talvez implementá-las com enum
                case 0:
                    BigInteger integerPart = value.toBigInteger();

                    if (BigInteger.ONE.equals(integerPart)) {
                        if (currency) {
                            sb.append(" ").append(COIN_SINGLE);
                        } else {
                            sb.append(" ");
                        }
                    } else if (integerPart.compareTo(BigInteger.ZERO) > 0) {
                        if (lastNonZeroExponent >= 6) {
                            sb.append(" ").append(DESCRITIVE_PARTICLE);
                        }
                        if (currency) {
                            sb.append(" ").append(COIN_PLURAL);
                        } else {
                            sb.append(" ");
                        }
                    }
                    break;
                case -3:
                    if (currency) {
                        if (1 == value2) {
                            sb.append(" ").append(FRACTION_SINGULAR);
                        } else if (value2 > 1) {
                            sb.append(" ").append(FRACTION_PLURAL);
                        }
                    }
                    break;
            }
            exponent -= 3;
        }
        return sb.substring(3);
    }

    /**
     * Compoe os nomes dos grupos de numeros
     *
     * @param valor {@code int} Valor à ser composto
     * @return {@code StringBuilder} Composição
     */
    private StringBuilder buildGroupNames(int valor) {
        StringBuilder name = new StringBuilder();
        int hundreds = valor - (valor % 100);
        int unitys = valor % 10;
        int tens = (valor - hundreds) - unitys;
        int twoDecimals = tens + unitys;
        if (hundreds > 0) {
            name.append(" ").append(ADTIVE_PARTICLE).append(" ");

            if (100 == hundreds) {
                if (twoDecimals > 0) {
                    name.append(HUNDRED_PLURAL);
                } else {
                    name.append(HUNDRED_SINGLE);
                }
            } else {
                name.append(nomes.get(hundreds));
            }
        }
        if (twoDecimals > 0) {
            name.append(" ").append(ADTIVE_PARTICLE).append(" ");
            if (twoDecimals < 20) {
                name.append(nomes.get(twoDecimals));
            } else {
                if (tens > 0) {
                    name.append(nomes.get(tens));
                }
                if (unitys > 0) {
                    name.append(" ").append(ADTIVE_PARTICLE).append(" ");
                    name.append(nomes.get(unitys));
                }
            }
        }
        return name.delete(0, 3);
    }

    /**
     * Retorna o nome da grandeza recebida
     *
     * @param exponent {@code int} Expoente
     * @param value {@code int} Valor
     * @return Nome da grandeza
     */
    private String getGreatnessName(int exponent, int value) {
        if (exponent < 3) {
            return "";
        }
        if (1 == value) {
            return sigleGreatness.get(exponent);
        } else {
            return pluralGreatness.get(exponent);
        }
    }

    /**
     * Decompoe o valor recebido
     *
     * @param value {@code BigDecimal} Valor à ser decomposto
     * @return  {@code Stack(Integer)} Decomposição do valor
     */
    private Stack<Integer> decompose(BigDecimal value) {
        BigInteger intermediate = value.multiply(new BigDecimal(100)).toBigInteger();
        Stack<Integer> decomposed = new Stack<Integer>();
        BigInteger[] result = intermediate.divideAndRemainder(HUNDRED);
        intermediate = result[0];
        decomposed.add(result[1].intValue());
        while (intermediate.compareTo(BigInteger.ZERO) > 0) {
            result = intermediate.divideAndRemainder(THOUSAND);
            intermediate = result[0];
            decomposed.add(result[1].intValue());
        }
        /*
         * Se o valor for apenas em centavos, adicionar zero para a casa dos
         * reais inteiros
         */
        if (decomposed.size() == 1) {
            decomposed.add(0);
        }
        return decomposed;
    }

    /**
     * Preenche as grandezas
     */
    private void fillPluralGreatness() {
        pluralGreatness.put(3, "MIL");
        pluralGreatness.put(6, "MILHÕES");
        pluralGreatness.put(9, "BILHÕES");
        pluralGreatness.put(12, "TRILHÕES");
        pluralGreatness.put(15, "QUATRILHÕES");
        pluralGreatness.put(18, "QUINTILHÕES");
        pluralGreatness.put(21, "SEXTILHÕES");
        pluralGreatness.put(24, "SETILHÕES");
    }

    /**
     * Preenche as grandezas singulares
     */
    private void fillSingleGreatness() {
        sigleGreatness.put(3, "MIL");
        sigleGreatness.put(6, "MILHÃO");
        sigleGreatness.put(9, "BILHÃO");
        sigleGreatness.put(12, "TRILHÃO");
        sigleGreatness.put(15, "QUATRILHÃO");
        sigleGreatness.put(18, "QUINTILHÃO");
        sigleGreatness.put(21, "SEXTILHÃO");
        sigleGreatness.put(24, "SETILHÃO");
    }

    /**
     * Preenche os nomes dos numeros
     */
    private void fillNames() {
        nomes.put(1, "UM");
        nomes.put(2, "DOIS");
        nomes.put(3, "TRÊS");
        nomes.put(4, "QUATRO");
        nomes.put(5, "CINCO");
        nomes.put(6, "SEIS");
        nomes.put(7, "SETE");
        nomes.put(8, "OITO");
        nomes.put(9, "NOVE");
        nomes.put(10, "DEZ");
        nomes.put(11, "ONZE");
        nomes.put(12, "DOZE");
        nomes.put(13, "TREZE");
        nomes.put(14, "QUATORZE");
        nomes.put(15, "QUINZE");
        nomes.put(16, "DEZESSEIS");
        nomes.put(17, "DEZESSETE");
        nomes.put(18, "DEZOITO");
        nomes.put(19, "DEZENOVE");
        nomes.put(20, "VINTE");
        nomes.put(30, "TRINTA");
        nomes.put(40, "QUARENTA");
        nomes.put(50, "CINQUENTA");
        nomes.put(60, "SESSENTA");
        nomes.put(70, "SETENTA");
        nomes.put(80, "OITENTA");
        nomes.put(90, "NOVENTA");
        nomes.put(200, "DUZENTOS");
        nomes.put(300, "TREZENTOS");
        nomes.put(400, "QUATROCENTOS");
        nomes.put(500, "QUINHENTOS");
        nomes.put(600, "SEISCENTOS");
        nomes.put(700, "SETECENTOS");
        nomes.put(800, "OITOCENTOS");
        nomes.put(900, "NOVECENTOS");
    }

    /**
     * Método principal
     *
     * @param args Argumentos
     */
    public static void main(String[] args) {
        NumberWriter writer = new NumberWriter();
        System.out.println(writer.write(new BigDecimal(0.5), false));
        System.out.println(writer.write(new BigDecimal(52.56), false));
        System.out.println(writer.write(new BigDecimal(12.57), true));
    }
}
