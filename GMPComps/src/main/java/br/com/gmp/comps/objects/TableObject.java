package br.com.gmp.comps.objects;

/**
 * Objeto default para preenchimento de tabelas
 *
 * @author kaciano
 * @version 1.0
 */
public class TableObject {

    private String a;
    private String b;
    private String c;

    /**
     *
     * @param a
     * @param b
     * @param c
     */
    public TableObject(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a + " - " + b + " - " + c;
    }

}
