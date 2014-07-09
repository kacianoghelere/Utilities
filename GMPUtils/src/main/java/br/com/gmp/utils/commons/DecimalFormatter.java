package br.com.gmp.utils.commons;

/**
 * Enum utilitário para formatação de casa decimais
 * @author kaciano
 */
public enum DecimalFormatter {

    /**
     * Formato sem casas decimais
     */
    ZERO {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0");
                }

                @Override
                public Integer getNumber() {
                    return 0;
                }
            },

    /**
     * Formato de uma casa decimal
     */
    ONE {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.0");
                }

                @Override
                public Integer getNumber() {
                    return 1;
                }
            },

    /**
     * Formato para duas casas decimais
     */
    TWO {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.00");
                }

                @Override
                public Integer getNumber() {
                    return 2;
                }
            },

    /**
     * Formato para três casas decimais
     */
    THREE {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.000");
                }

                @Override
                public Integer getNumber() {
                    return 3;
                }
            },

    /**
     * Formato para quatro casas decimais
     */
    FOUR {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.0000");
                }

                @Override
                public Integer getNumber() {
                    return 4;
                }
            },

    /**
     * Formato para cinco casas decimais
     */
    FIVE {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.00000");
                }

                @Override
                public Integer getNumber() {
                    return 5;
                }
            },

    /**
     * Formato para seis casas decimais
     */
    SIX {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.000000");
                }

                @Override
                public Integer getNumber() {
                    return 6;
                }
            },

    /**
     * Formato para sete casas decimais
     */
    SEVEN {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.0000000");
                }

                @Override
                public Integer getNumber() {
                    return 7;
                }
            },

    /**
     * Formato para oito casas decimais
     */
    EIGHT {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.00000000");
                }

                @Override
                public Integer getNumber() {
                    return 8;
                }
            },

    /**
     * Formato para nove casas decimais
     */
    NINE {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.000000000");
                }

                @Override
                public Integer getNumber() {
                    return 9;
                }
            },

    /**
     * Formato para dez casas decimais
     */
    TEEN {

                @Override
                public java.text.DecimalFormat getFormat() {
                    return new java.text.DecimalFormat("#,###,##0.0000000000");
                }

                @Override
                public Integer getNumber() {
                    return 10;
                }
            };

    /**
     * Metodo que adiciona o formato para o campo
     *
     * @return DecimalFormat para o campo {@code Integer} Retorna o formato
     * das casas decimais
     */
    protected abstract java.text.DecimalFormat getFormat();

    /**
     * Retorna o número Inteiro que representa as casas decimais
     *
     * @return Integer {@code Integer} Retorna o inteiro das casas decimais
     */
    public abstract Integer getNumber();
}
