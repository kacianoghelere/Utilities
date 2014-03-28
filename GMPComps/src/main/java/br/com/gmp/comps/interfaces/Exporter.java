package br.com.gmp.comps.interfaces;

import java.util.List;

/**
 * Interface para componentes que podem exportar listas de dados
 *
 * @author kaciano
 */
public interface Exporter {

    /**
     * Exporta os dados no padrão Xls (Excel)
     */
    void exportXLS();

    /**
     * Exporta os dados no padrão Txt     

     */
    void exportTXT();

    /**
     * Exporta os dados no padrão Pdf
     */
    void exportPDF();
}
