package br.com.gmp.utils.collections;

/**
 * Objeto utilitario para arquivar objetos e suas respectivas posicoes em uma
 * List
 *
 * @author kaciano
 */
public class ListData {

    private int position;
    private Object data;

    /**
     * Cria nova instancia de ListData
     */
    public ListData() {
    }

    /**
     * Cria nova instancia de ListData
     *
     * @param position {@code int} Posicao do objeto
     * @param data {@code Object} Dados da posicao
     */
    public ListData(int position, Object data) {
        this.position = position;
        this.data = data;
    }

    /**
     * Retorna a Posicao selecionada da lista
     *
     * @return {@code int} Posicao selecionada da lista
     */
    public int getPosition() {
        return position;
    }

    /**
     * Modifica os Dados da lista selecionados
     *
     * @param position {@code Object} Dados da lista selecionados
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Retorna os Dados da lista selecionados
     *
     * @return {@code Object} Dados da lista selecionados
     */
    public Object getData() {
        return data;
    }

    /**
     * Modifica os Dados da lista selecionados
     *
     * @param data {@code Object} Dados da lista selecionados
     */
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.position;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListData other = (ListData) obj;
        return this.position == other.position;
    }

    @Override
    public String toString() {
        return "ListData{" + "position= " + position + ", data= " + data + '}';
    }

}
