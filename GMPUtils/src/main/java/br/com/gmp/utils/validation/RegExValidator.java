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
     * <html>Valida uma String contendo um e-mail<br />
     * Ex:<br />
     * Valido: teste@teste.com ou teste@teste.com.br<br />
     * Invalido: test @teste.com ou teste@teste
     * </html>
     *
     * @param email <code>String</code> E-mail à ser validado
     * @return <code>Boolean</code> Resultado da validação
     */
    public Boolean validateEmail(String email) {
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

}
