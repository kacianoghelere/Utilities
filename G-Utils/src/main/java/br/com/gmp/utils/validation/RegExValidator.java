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
     * Valida uma String contendo um e-mail<br>
     * Ex:<br>
     * Valido: {@code teste@teste.com} ou
     * {@code teste@teste.com.br}<br>
     * Invalido: {@code test@testecom} ou {@code teste@teste}
     *
     * @param email {@code String} E-mail à ser validado
     * @return {@code Boolean} Resultado da validação
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
     * Valida uma String contendo um URL<br>
     * Ex:<br>
     * Valido: {@code http://www.test.com} ou
     * {@code https://www.test.com.br} <br>
     * Invalido: {@code http://test.com} ou
     * {@code httpt://www.test.com.br}
     *
     * @param url {@code String} URL à ser validado
     * @return {@code Boolean} Resultado da validação
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
