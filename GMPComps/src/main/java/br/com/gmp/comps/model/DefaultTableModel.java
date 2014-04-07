package br.com.gmp.comps.model;

import br.com.gmp.comps.annotations.ColumnName;
import br.com.gmp.utils.annotations.Ignore;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo de tabelas padrão para GMPTables. Funcional para todas as JTables,
 * desde que esteja configurado corretamente (Não deve ser instanciado, apenas
 * convertido em objetos anonimos)
 *
 * Exemplo de uso:
 * <br><code>
 * class NewTableModel extends DefaultTableModel(Object) {<br>
 * public NewTableModel() {<br>
 * super(Object.class)<br>
 * }<br>
 * }<br>
 * </code><br>
 *
 * @author kaciano
 * @version 1.1
 * @param <T>
 * @see javax.swing.table.TableModel
 */
public class DefaultTableModel<T> extends AbstractTableModel {

    private Class<T> objClass;
    private String[] columns = null;
    private List<T> data;

    /**
     * Cria novo DefaultTableModel
     */
    public DefaultTableModel() {
        initialize(null);
    }

    /**
     * Cria novo DefaultTableModel
     *
     * @param list <code>List(Object)</code> Lista de objetos
     */
    public DefaultTableModel(List<T> list) {
        initialize(list);
    }

    /**
     * Metodo de inicialização
     *
     * @param objClass <code>Class(Object)</code> Classe a ser mapeada
     * @param list <code>List(Object)</code> Lista de objetos
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
     * @return <code>String[]</code> Colunas do objeto
     */
    public String[] getColumnNames() {
        return this.columns;
    }

    /**
     * Busca as colunas na classe do objeto do modelo
     *
     * @param cl <code>Class</code> Classe a ser mapeada
     * @return <code>String[]</code> Colunas do objeto
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
     * @param row <code>int</code> Index da linha
     * @param column <code>int</code> Index da coluna
     * @return <code>boolean</code> É editavel?
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        return (column != 0);
    }

    /**
     * Retorna a quantidade de linhas
     *
     * @return <code>int</code> Quantidade de linhas
     */
    @Override
    public int getRowCount() {
        return data.size();
    }

    /**
     * Retorna a quantidade de colunas
     *
     * @return <code>int</code> Quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    /**
     * Retorna o valor com base na linha e na coluna recebidas
     *
     * @param row <code>int</code> Index da linha
     * @param column <code>int</code> Index da coluna
     * @return <code>int</code>
     */
    @Override
    public Object getValueAt(int row, int column) {
        try {
            Object u = data.get(row);
            Field f = getFields(u.getClass())[column];
            f.setAccessible(true);
            return f.get(u);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(DefaultTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Retorna os campos mapeaveis da classe
     *
     * @param cl <code><b>Class</b>(?)</code> Classe do Field
     * @return <code>Field[]</code> Fields mapeados
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
     * @param column <code>int</code> Index da coluna
     * @return <code>String</code> Nome da coluna
     */
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    /**
     * Retorna a classe da coluna recebida
     *
     * @param column <code>int</code> Index da coluna
     * @return <code>Class<?></code> Classe da coluna
     */
    @Override
    public Class<?> getColumnClass(int column) {
        return getFieldClass(objClass, column);
    }

    /**
     * Retorna a classe do Field recebido
     *
     * @param cl <code>Class</code> Classe a ser mapeada
     * @param id <code>int</code> ID do Field
     * @return <code>Class<?></code> Classe do Field
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
            Logger.getLogger(DefaultTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return new Object().getClass();
        }
    }

    /**
     * Retorna a linha do objeto indicado
     *
     * @param obj <code>Object</code> Objeto
     * @return <code>Integer</code> Linha do objeto
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
     * Adiciona novo objeto à lista
     *
     * @param obj <code>Object</code> Novo objeto
     */
    public void add(T obj) {
        data.add(obj);
        this.fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    /**
     * Adiciona novos objetos à lista
     *
     * @param obj <code>Object[]</code> Novos objetos
     */
    public void addAll(T... obj) {
        data.addAll(Arrays.asList(obj));
        this.fireTableDataChanged();
    }

    /**
     * Remove a linha recebida
     *
     * @param row <code>int</code> Linha
     */
    public void remove(int row) {
        data.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    /**
     * Remove o Objeto recebido
     *
     * @param object <code>Object</code> Objeto
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
     * @param objects <code>Object[]</code> Objetos
     */
    public void remove(T... objects) {
        for (T t : objects) {
            if (data.contains(t)) {
                int row = getObjectRow(t);
                data.remove(t);
                this.fireTableRowsDeleted(row, row);
            }
        }
    }

    /**
     * Atualiza o objeto da linha recebida com o novo objeto
     *
     * @param row <code>int</code> Linha
     * @param object <code>Object</code> Novo conteudo da linha
     */
    public void update(int row, T object) {
        data.set(row, object);
        this.fireTableRowsUpdated(row, row);
    }

    /**
     * Retorna o objeto com base na linha recebida
     *
     * @param row <code>int</code> Linha
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
     * Retorna a classe do modelo
     *
     * @return <code>Class</code> Classe do modelo
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
     * @return <code>String[]</code> Colunas
     */
    public String[] getColumns() {
        return columns;
    }

    /**
     * Altera as colunas
     *
     * @param columns <code>String[]</code> Colunas
     */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    /**
     * Retorna a lista do modelo
     *
     * @return <code>List</code> Lista do modelo
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica a lista do modelo
     *
     * @param data <code>List</code> Lista do modelo
     */
    public void setData(List<T> data) {
        this.data = data;
        this.reload();
    }

}
