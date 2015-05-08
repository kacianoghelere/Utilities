package br.com.gmp.comps.table.column;

/**
 * Objeto para controle de colunas das GTables
 *
 * @author kaciano
 * @version 1.0
 */
public class GTableColumn {

    private int id;
    private String title;

    /**
     * Cria nova instancia de GTableColumn
     */
    public GTableColumn() {
    }

    /**
     * Cria nova instancia de GTableColumn
     *
     * @param id {@code int} Endereço da coluna
     * @param title {@code String} Nome da coluna
     */
    public GTableColumn(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
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
        final GTableColumn other = (GTableColumn) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * Retorna o Endereço da coluna
     *
     * @return {@code int} Endereço da coluna
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica o Endereço da coluna
     *
     * @param id {@code int} Endereço da coluna
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o Nome da coluna
     *
     * @return {@code String} Nome da coluna
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modifica o Nome da coluna
     *
     * @param title {@code String} Nome da coluna
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
