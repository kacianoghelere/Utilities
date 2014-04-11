package br.com.gmp.utils.validation;

import br.com.gmp.utils.regex.VerbalExpression;

/**
 * Coleção de métodos utilitários para validação utilizando RegEx
 *
 * @author kaciano
 * @version 1.0
 */
public class RegExValidator {

    /**
     * Valida uma String contendo um e-mail<br />
     * Ex:<br />
     * Valido: <code>teste@teste.com</code> ou
     * <code>teste@teste.com.br</code><br />
     * Invalido: <code>test@testecom</code> ou <code>teste@teste</code>
     *
     * @param email <code>String</code> E-mail à ser validado
     * @return <code>Boolean</code> Resultado da validação
     */
    public static Boolean validateEmail(String email) {
        VerbalExpression vexp = new VerbalExpression.Builder()
                .startOfLine()
                .anythingButNot(" ")
                .then("@")
                .anythingButNot(" ")
                .then(".")
                .anythingButNot(" ")
                .endOfLine().build();
        return vexp.test(email);
    }

    /**
     * Valida uma String contendo um URL<br />
     * Ex:<br />
     * Valido: <code>http://www.test.com</code> ou
     * <code>https://www.test.com.br</code> <br />
     * Invalido: <code>http://test.com</code> ou
     * <code>httpt://www.test.com.br</code>
     *
     * @param url <code>String</code> URL à ser validado
     * @return <code>Boolean</code> Resultado da validação
     */
    public static Boolean validateUrl(String url) {
        VerbalExpression vexp = new VerbalExpression.Builder()
                .startOfLine()
                .then("http")
                .maybe("s")
                .then("://")
                .maybe("www.")
                .anythingButNot(" ")
                .endOfLine()
                .build();
        return vexp.test(url);
    }

}
