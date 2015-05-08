package br.com.gmp.comps.model;

import br.com.gmp.utils.annotations.ColumnName;
import br.com.gmp.utils.annotations.Ignore;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modelo de tabelas padrão para GMPTables. Funcional para todas as JTables,
 * desde que esteja configurado corretamente
 *
 * Exemplo de uso:
 * <br>{@code 
 * class NewTableModel extends GMPTableModel<<b>Object</b>> {<br>
 * public NewTableModel() {<br>
 * super(<b>Object</b>.class)<br>
 * }<br>
 * }<br>
 * }<br>
 *
 * @author kaciano
 * @version 1.1
 * @see javax.swing.table.TableModel
 */
public class GMPTableModel extends SimpleTableModel {

    private Class<?> objClass;
    private String[] columns = null;
    private List list;

    /**
     * Cria novo GMPTableModel
     *
     * @param objClass {@code <b>Class</b>(Object)} Classe a ser mapeada
     */
    public GMPTableModel(Class<?> objClass) {
        initialize(objClass, null);
    }

    /**
     * Cria novo GMPTableModel
     *
     * @param objClass {@code <b>Class</b>(Object)} Classe a ser mapeada
     * @param list {@code <b>List</b>Object} Lista de objetos
     */
    public GMPTableModel(Class<?> objClass, List list) {
        initialize(objClass, list);
    }

    /**
     * Metodo de inicialização
     *
     * @param objClass {@code <b>Class</b>(Object)} Classe a ser mapeada
     * @param list {@code <b>List</b>(Object)} Lista de objetos
     */
    private void initialize(Class<?> objClass, List list) {
        this.objClass = objClass;
        this.list = list != null ? list : new ArrayList<>();
        this.columns = mapColumns(objClass);
    }

    /**
     * Retorna os nomes das colunas
     *
     * @return {@code <b>String[]</b>} Colunas do objeto
     */
    public String[] getColumnNames() {
        return this.columns;
    }

    /**
     * Busca as colunas na classe do objeto do modelo
     *
     * @param cl {@code <b>Class</b>} Classe a ser mapeada
     * @return {@code <b>String[]</b>} Colunas do objeto
     */
    private String[] mapColumns(Class<?> cl) {
        String[] column = new String[getFields(cl).length];

        for (int i = 0; i < getFields(cl).length; i++) {
            if (getFields(cl)[i]
                    .isAnnotationPresent(ColumnName.class)
                    && !getFields(cl)[i]
                    .isAnnotationPresent(Ignore.class)) {
                column[i] = getFields(cl)[i]
                        .getAnnotation(ColumnName.class).name();
            } else {
                column[i] = getFields(cl)[i].getName();
            }
        }
        return column;
    }

    /**
     * Retorna se a coluna é editavel
     *
     * @param row {@code <b>int</b>} Index da linha
     * @param column {@code <b>int</b>} Index da coluna
     * @return {@code <b>boolean</b>} É editavel?
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        return (column != 0);
    }

    /**
     * Retorna a quantidade de linhas
     *
     * @return {@code <b>int</b>} Quantidade de linhas
     */
    @Override
    public int getRowCount() {
        return list.size();
    }

    /**
     * Retorna a quantidade de colunas
     *
     * @return {@code <b>int</b>} Quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    /**
     * Retorna o valor com base na linha e na coluna recebidas
     *
     * @param row {@code <b>int</b>} Index da linha
     * @param column {@code <b>int</b>} Index da coluna
     * @return {@code <b>int</b>}
     */
    @Override
    public Object getValueAt(int row, int column) {
        try {
            Object u = list.get(row);
            Field f = getFields(u.getClass())[column];
            f.setAccessible(true);
            return f.get(u);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GMPTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Retorna o nome da coluna
     *
     * @param column {@code <b>int</b>} Index da coluna
     * @return {@code <b>String</b>} Nome da coluna
     */
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    /**
     * Retorna a classe da coluna recebida
     *
     * @param column {@code <b>int</b>} Index da coluna
     * @return {@code <b>Class</b>(?)} Classe da coluna
     */
    @Override
    public Class<?> getColumnClass(int column) {
        return getFieldClass(objClass, column);
    }

    /**
     * Retorna a classe do Field recebido
     *
     * @param cl {@code <b>Class</b>} Classe a ser mapeada
     * @param id {@code <b>int</b>} ID do Field
     * @return {@code <b>Class</b>(?)} Classe do Field
     */
    private Class<?> getFieldClass(Class<?> cl, int id) {
        try {
            Field[] f = getFields(cl);
            f[id].setAccessible(true);
            Class<?> c = cl.getDeclaredField(f[id].getName()).getType();
            if (c == boolean.class) {
                return Boolean.class;
            }
            return c;
        } catch (SecurityException | NoSuchFieldException ex) {
            Logger.getLogger(GMPTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return new Object().getClass();
        }
    }

    /**
     * Retorna os campos mapeaveis da classe
     *
     * @param cl {@code <b>Class</b>(?)} Classe do Field
     * @return {@code Field[]} Fields mapeados
     */
    public Field[] getFields(Class<?> cl) {
        List<Field> fields = new ArrayList<>();
        for (Field f : cl.getDeclaredFields()) {
            f.setAccessible(true);
            if (!f.isAnnotationPresent(Ignore.class)) {
                fields.add(f);
            }
        }
        Field[] array = fields.toArray(new Field[]{});
        fields.clear();
        return array;
    }

    /**
     * Retorna a linha do objeto indicado
     *
     * @param obj {@code Object} Objeto
     * @return {@code Integer} Linha do objeto
     */
    public Integer getObjectRow(Object obj) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(obj)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Adiciona novo objeto à lista
     *
     * @param obj {@code <b>Object</b>} Novo objeto
     */
    public void add(Object obj) {
        list.add(obj);
        this.fireTableRowsInserted(list.size() - 1, list.size() - 1);
    }

    /**
     * Adiciona novos objetos à lista
     *
     * @param obj {@code <b>Object[]</b>} Novos objetos
     */
    public void addAll(Object... obj) {
        list.addAll(Arrays.asList(obj));
        this.fireTableDataChanged();
    }

    /**
     * Remove a linha recebida
     *
     * @param row {@code <b>int</b>} Linha
     */
    public void remove(int row) {
        list.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    /**
     * Remove o Objeto recebido
     *
     * @param object {@code <b>Object</b>} Objeto
     */
    public void remove(Object object) {
        if (list.contains(object)) {
            int row = getObjectRow(object);
            list.remove(object);
            this.fireTableRowsDeleted(row, row);
        }
    }

    /**
     * Remove os Objetos recebidos
     *
     * @param objects {@code <b>Object[]</b>} Objetos
     */
    public void remove(Object... objects) {
        for (Object object : objects) {
            if (list.contains(object)) {
                int row = getObjectRow(object);
                list.remove(object);
                this.fireTableRowsDeleted(row, row);
            }
        }
    }

    /**
     * Atualiza o objeto da linha recebida com o novo objeto
     *
     * @param row {@code <b>int</b>} Linha
     * @param obj {@code <b>Object</b>} Novo conteudo da linha
     */
    public void update(int row, Object obj) {
        list.set(row, obj);
        this.fireTableRowsUpdated(row, row);
    }

    /**
     * Retorna o objeto com base na linha recebida
     *
     * @param row {@code <b>int</b>} Linha
     * @return Objeto da linha
     */
    public Object getObject(int row) {
        return list.get(row);
    }

    /**
     * Recarrega o modelo
     */
    public void reload() {
        this.fireTableDataChanged();
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Object object = list.get(row);
        Field field = object.getClass().getDeclaredFields()[col];
        try {
            field.setAccessible(true);
            field.set(object, value);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        fireTableCellUpdated(row, col);
    }

    /**
     * Limpa os dados do modelo
     */
    public void clear() {
        this.list.clear();
    }

    /**
     * Retorna a classe do modelo
     *
     * @return {@code Class} Classe do modelo
     */
    public Class<?> getObjClass() {
        return objClass;
    }

    /**
     * s
     *
     * @param objClass
     */
    public void setObjClass(Class<?> objClass) {
        this.objClass = objClass;
    }

    /**
     * Retorna as colunas
     *
     * @return {@code String[]} Colunas
     */
    public String[] getColumns() {
        return columns;
    }

    /**
     * Altera as colunas
     *
     * @param columns {@code String[]} Colunas
     */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    /**
     * Retorna a lista do modelo
     *
     * @return {@code List} Lista do modelo
     */
    public List getList() {
        return list;
    }

    /**
     * Modifica a lista do modelo
     *
     * @param list {@code List} Lista do modelo
     */
    public void setList(List list) {
        this.list = list;
    }

}
