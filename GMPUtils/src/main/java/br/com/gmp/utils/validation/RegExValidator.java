package br.com.gmp.utils.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Coleção de métodos utilitários para validação utilizando RegEx
 *
 * @author kaciano
 * @version 1.0
 */
public class RegExValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public RegExValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

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
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
