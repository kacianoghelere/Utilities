package br.com.gmp.comps.model;

import br.com.gmp.utils.annotations.ColumnName;
import br.com.gmp.utils.annotations.Editable;
import br.com.gmp.utils.annotations.Ignore;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modelo de tabelas padrão para GMPTables. Funcional para todas as JTables,
 * desde que esteja configurado corretamente (Não deve ser instanciado, apenas
 * convertido em objetos anonimos)
 *
 * Exemplo de uso:
 * <br>{@code
 * class NewTableModel extends GTableModel(Object) {<br>
 * public NewTableModel() {<br>
 * super(Object.class)<br>
 * }<br>
 * }<br> }<
 * br>
 *
 * @author kaciano
 * @version 1.1
 * @param <T>
 * @see javax.swing.table.TableModel
 */
public class GTableModel<T> extends SimpleTableModel {

    private Class<T> objClass;
    private String[] columns = null;
    private List<T> data;

    /**
     * Cria novo DefaultTableModel
     */
    public GTableModel() {
        initialize(null);
    }

    /**
     * Cria novo DefaultTableModel
     *
     * @param list {@code List(Object)} Lista de objetos
     */
    public GTableModel(List<T> list) {
        initialize(list);
    }

    /**
     * Cria novo DefaultTableModel
     *
     * @param list {@code Class} Classe de objetos
     */
    public GTableModel(Class list) {
        this.objClass = list;
        this.data = new ArrayList<>();
        this.columns = mapColumns(objClass);
    }

    /**
     * Metodo de inicialização
     *
     * @param objClass {@code Class(Object)} Classe a ser mapeada
     * @param list {@code List(Object)} Lista de objetos
     */
    private void initialize(List list) {
        this.objClass = (Class<T>) ((ParameterizedType) (getClass()
                .getGenericSuperclass())).getActualTypeArguments()[0];
        this.data = list != null ? list : new ArrayList<>();
        this.columns = mapColumns(objClass);
    }

    /**
     * Retorna os nomes das colunas
     *
     * @return {@code String[]} Colunas do objeto
     */
    public String[] getColumnNames() {
        return this.columns;
    }

    /**
     * Busca as colunas na classe do objeto do modelo
     *
     * @param cl {@code Class} Classe a ser mapeada
     * @return {@code String[]} Colunas do objeto
     */
    private String[] mapColumns(Class<?> cl) {
        String[] coluna = new String[getFields(cl).length];
        for (int i = 0; i < getFields(cl).length; i++) {
            if (getFields(cl)[i]
                    .isAnnotationPresent(ColumnName.class)) {
                coluna[i] = getFields(cl)[i]
                        .getAnnotation(ColumnName.class).name();
            } else {
                coluna[i] = getFields(cl)[i].getName();
            }
        }
        return coluna;
    }

    /**
     * Retorna se a coluna é editavel
     *
     * @param row {@code int} Index da linha
     * @param column {@code int} Index da coluna
     * @return {@code boolean} É editavel?
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        return getFields(objClass)[column].isAnnotationPresent(Editable.class);
    }

    /**
     * Retorna a quantidade de linhas
     *
     * @return {@code int} Quantidade de linhas
     */
    @Override
    public int getRowCount() {
        return data.size();
    }

    /**
     * Retorna a quantidade de colunas
     *
     * @return {@code int} Quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    /**
     * Retorna o valor com base na linha e na coluna recebidas
     *
     * @param row {@code int} Index da linha
     * @param column {@code int} Index da coluna
     * @return {@code int}
     */
    @Override
    public Object getValueAt(int row, int column) {
        try {
            Object u = data.get(row);
            Field f = getFields(u.getClass())[column];
            f.setAccessible(true);
            if (f.getClass().isArray()) {
                return Arrays.toString((Object[]) f.get(u));
            }
            return f.get(u);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
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
     * Retorna o nome da coluna
     *
     * @param column {@code int} Index da coluna
     * @return {@code String} Nome da coluna
     */
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    /**
     * Retorna a classe da coluna recebida
     *
     * @param column {@code int} Index da coluna
     * @return {@code Class<?>} Classe da coluna
     */
    @Override
    public Class<?> getColumnClass(int column) {
        return getFieldClass(objClass, column);
    }

    /**
     * Retorna a classe do Field recebido
     *
     * @param cl {@code Class} Classe a ser mapeada
     * @param id {@code int} ID do Field
     * @return {@code Class<?>} Classe do Field
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
            Logger.getLogger(GTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return new Object().getClass();
        }
    }

    /**
     * Retorna a linha do objeto indicado
     *
     * @param obj {@code Object} Objeto
     * @return {@code Integer} Linha do objeto
     */
    public Integer getObjectRow(Object obj) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals(obj)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Retorna se o modelo contem o objeto, ou não...
     *
     * @param t {@code T} Objeto
     * @return {@code boolean} Retorna se o modelo contem o objeto ou não
     */
    public boolean contains(T t) {
        return this.data.contains(t);
    }

    /**
     * Adiciona novo objeto à lista
     *
     * @param obj {@code Object} Novo objeto
     */
    public void add(T obj) {
        data.add(obj);
        this.fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    /**
     * Adiciona novos objetos à lista
     *
     * @param obj {@code Object[]} Novos objetos
     */
    public void addAll(T... obj) {
        data.addAll(Arrays.asList(obj));
        this.fireTableDataChanged();
    }

    /**
     * Remove a linha recebida
     *
     * @param row {@code int} Linha
     */
    public void remove(int row) {
        data.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    /**
     * Remove as linhas recebidas
     *
     * @param row {@code int[]} Linhas
     */
    public void remove(int[] row) {
        List<T> list = new ArrayList<>();
        for (int i : row) {
            list.add(getObject(i));
        }
        for (T t : list) {
            remove(t);
        }
        this.reload();
    }

    /**
     * Remove o Objeto recebido
     *
     * @param object {@code Object} Objeto
     */
    public void remove(T object) {
        if (data.contains(object)) {
            int row = getObjectRow(object);
            data.remove(object);
            this.fireTableRowsDeleted(row, row);
        }
    }

    /**
     * Remove os Objetos recebidos
     *
     * @param objects {@code Object[]} Objetos
     */
    public void remove(T[] objects) {
        for (T t : objects) {
            if (data.contains(t)) {
                data.remove(t);
            }
        }
        this.reload();
    }

    /**
     * Atualiza o objeto da linha recebida com o novo objeto
     *
     * @param row {@code int} Linha
     * @param object {@code Object} Novo conteudo da linha
     */
    public void update(int row, T object) {
        data.set(row, object);
        this.fireTableRowsUpdated(row, row);
    }

    /**
     * Retorna o objeto com base na linha recebida
     *
     * @param row {@code int} Linha
     * @return Objeto da linha
     */
    public T getObject(int row) {
        return data.get(row);
    }

    /**
     * Recarrega o modelo
     */
    public void reload() {
        this.fireTableDataChanged();
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Object object = data.get(row);
        Field field = getFields(object.getClass())[col];
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
        this.data.clear();
    }

    /**
     * Retorna a quantidade de dados do modelo
     *
     * @return {@code int} Quantidade de dados do modelo
     */
    public int getSize() {
        return data.size();
    }

    /**
     * Retorna se os dados existem
     *
     * @return {@code Boolean} Modelo está vazio?
     */
    public Boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Retorna a classe do modelo
     *
     * @return {@code Class} Classe do modelo
     */
    public Class<T> getObjClass() {
        return objClass;
    }

    /**
     * s
     *
     * @param objClass
     */
    public void setObjClass(Class<T> objClass) {
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
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica a lista do modelo
     *
     * @param data {@code List} Lista do modelo
     */
    public void setData(List<T> data) {
        this.data = data;
        this.reload();
    }

}
