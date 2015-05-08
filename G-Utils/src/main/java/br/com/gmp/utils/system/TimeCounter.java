package br.com.gmp.utils.system;

/**
 * Classe utilitária para controle de tempos de execução
 *
 * @author kaciano
 * @version 1.0
 */
public class TimeCounter {

    private long before;

    /**
     * Cria nova instancia de TimeCounter
     */
    public TimeCounter() {
        before = System.currentTimeMillis();
    }

    /**
     * Retorna o tempo gasto entre a construção do objeto e a chamada do método
     *
     * @return {@code Long} Tempo gasto
     */
    public Long getTimeSpent() {
        return System.currentTimeMillis() - before;
    }

    /**
     * Reinicia o horario inicial do contador
     */
    public void reset() {
        before = System.currentTimeMillis();
    }

}
