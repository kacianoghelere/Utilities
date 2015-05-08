package br.com.gmp.comps.data;

import br.com.gmp.utils.annotations.Intercept;
import br.com.gmp.utils.object.ObjectCopy;
import br.com.gmp.utils.system.SystemProperties;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.Configuration;
import com.db4o.query.Query;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DAO Genérico para embasamento
 *
 * @author kaciano
 * @version 1.0
 * @param <T> Classe de entidade
 */
public class GenericDAO<T> implements DAO<T> {

    /**
     * Diretorio de armazenamento dos bancos de dados
     */
    public static final String DIR = SystemProperties.USER_HOME + "/.config/data/";
    /**
     * Delegacao da chamada de logs
     */
    private static final Logger LOGGER = Logger.getLogger(GenericDAO.class.getName());
    private Class<T> entity;
    private String database;
    private String sufix = ".yap";
    private final String id = "id";

    /**
     * Cria nova instancia de GenericDAO
     */
    public GenericDAO() {
        this.entity = (Class<T>) ((ParameterizedType) (getClass()
                .getGenericSuperclass())).getActualTypeArguments()[0];
        File file = new File(DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.database = DIR + entity.getSimpleName() + "DB" + sufix;
    }

    /**
     * Cria nova instancia de GenericDAO
     *
     * @param entity {@code Class(T)} Classe à ser instanciada
     */
    public GenericDAO(Class<T> entity) {
        this.entity = entity;
        File file = new File(DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.database = DIR + entity.getSimpleName() + "DB" + sufix;
    }

    /**
     * Cria nova instancia de GenericDAO
     *
     * @param entity {@code Class(T)} Classe à ser instanciada
     * @param path {@code String} Caminho do banco
     */
    public GenericDAO(Class<T> entity, String path) {
        this.entity = entity;
        this.database = path;
    }

    /**
     * Cria nova instancia de GenericDAO
     *
     * @param entity {@code Class(T)} Classe à ser instanciada
     * @param name {@code String} Nome do banco
     * @param sufix {@code String} Extensão do banco
     */
    public GenericDAO(Class<T> entity, String name, String sufix) {
        this.entity = entity;
        File file = new File(DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.database = DIR + name + "DB" + sufix;
    }

    /**
     * Retorna a conexão com o banco de dados para buscas externas
     *
     * @return {@code ObjectContainer} Conexão com o banco
     */
    protected ObjectContainer getClient() {
        Configuration conf = Db4o.configure();
        conf.objectClass(entity).objectField(id).indexed(true);
        conf.generateUUIDs(Integer.MAX_VALUE);
        return Db4o.openFile(conf, database);
    }

    /**
     * Busca todos os dados da entidade
     *
     * @return {@code List(T)} Entidade
     */
    @Intercept
    @Override
    public List<T> getList() {
        ObjectContainer db = getClient();
        Query query = db.query();
        query = new QueryBuilder(query)
                .constrain(entity)
                .descend(id)
                .orderAscending()
                .ready();
        ObjectSet os = query.execute();
        List<T> objs = new ArrayList<>();
        objs.addAll(os);
        db.close();
        return objs;
    }

    /**
     * Busca todos os dados da entidade
     *
     * @return {@code T[]} Entidade
     */
    @Override
    public Object[] getArray() {
        return getList().toArray();
    }

    /**
     * Insere a entidade no banco de dados
     *
     * @param entity {@code T} Entidade
     */
    @Intercept
    @Override
    public void insert(T entity) {
        ObjectContainer db = getClient();
        db.store(entity);
        db.commit();
        db.close();
    }

    /**
     * Insere as entidades no banco de dados
     *
     * @param entities {@code List(T)} Entidades
     */
    @Intercept
    @Override
    public void insertAll(List<T> entities) {
        ObjectContainer db = getClient();
        for (T ent : entities) {
            db.store(ent);
        }
        db.commit();
        db.close();
    }

    /**
     * Atualiza a entidade
     *
     * @param entity {@code T} Entidade
     * @throws java.lang.IllegalAccessException Acesso ilegal
     */
    @Intercept
    @Override
    public void update(T entity) throws IllegalArgumentException, IllegalAccessException {
        ObjectContainer db = getClient();
        ObjectSet<T> get = db.queryByExample(entity);
        ObjectCopy.copy(entity, get);
        db.store(get);
        db.commit();
        db.close();
    }

    /**
     * Deleta todos os objetos da lista
     *
     * @param entities {@code List(T)} Lista a ser deletada
     */
    @Intercept
    @Override
    public void deleteAll(List<T> entities) {
        ObjectContainer db = getClient();
        for (T ent : entities) {
            ObjectSet<T> os = db.queryByExample(ent);
            db.delete(os.next());
        }
        db.commit();
        db.close();
    }

    /**
     * Deleta todos os objetos do banco
     */
    @Intercept
    @Override
    public void deleteAll() {
        ObjectContainer db = getClient();
        ObjectSet<T> query = db.query(entity);
        for (T t : query) {
            db.delete(t);
        }
        db.commit();
        db.close();
    }

    /**
     * Deleta a entidade
     *
     * @param entity {@code T} Entidade
     */
    @Intercept
    @Override
    public void delete(T entity) {
        ObjectContainer db = getClient();
        ObjectSet<T> os = db.queryByExample(entity);
        db.delete(os.next());
        db.commit();
        db.close();
    }

    /**
     * Deleta todos os registros anteriores e insere os registros da lista
     *
     * @param entities {@code List(T)} Lista dos novos registros
     */
    @Intercept
    @Override
    public void replaceAll(List<T> entities) {
        deleteAll();
        insertAll(entities);
    }

    /**
     * Retorna a entidade a partir do ID
     *
     * @param id {@code Integer} ID
     * @return {@code T} Entidade
     */
    @Intercept
    @Override
    public T queryByID(Long id) {
        ObjectContainer db = getClient();
        Query query = db.query();
        query = new QueryBuilder(query)
                .constrain(entity)
                .searchFor(this.id, id.intValue())
                .descend(this.id)
                .orderAscending()
                .ready();
        ObjectSet<T> os = query.execute();
        List<T> list = new ArrayList<>();
        list.addAll(os);
        db.close();
        for (T ent : list) {
            return ent;
        }
        return null;
    }

    /**
     * Efetua a busca com base no campo informado
     *
     * @param field {@code String} Campo a ser verificado
     * @param value {@code Object} Valor da busca
     * @return {@code List(T)} Lista contendo o resultado
     */
    @Intercept
    @Override
    public List<T> queryByField(String field, Object value) {
        List<T> list = new ArrayList<>();
        ObjectContainer db = getClient();
        Query query = db.query();
        query = new QueryBuilder(query)
                .constrain(entity)
                .searchFor(field, value)
                .descend(id)
                .orderAscending()
                .ready();
        ObjectSet<T> os = query.execute();
        list.addAll(os);
        db.close();
        return list;
    }

    /**
     * Retorna a classe do objeto que aplica o DAO
     *
     * @return {@code Class(?)} Classe do DAO
     */
    @Override
    public Class<T> getObjClass() {
        return entity;
    }

    /**
     * Modifica a classe do objeto que aplica o DAO
     *
     * @param oClass {@code Class(?)} Classe do DAO
     */
    @Override
    public void setObjClass(Class<T> oClass) {
        this.entity = oClass;
    }

    /**
     * Retorna o prefixo da base de dados (Caminho do arquivo)
     *
     * @return {@code String} Prefixo da base de dados
     */
    protected String getDir() {
        return DIR;
    }

    /**
     * Retorna o nome da base de dados
     *
     * @return {@code String} Nome da base de dados
     */
    protected String getDatabase() {
        return database;
    }

    /**
     * Modifica o nome da base de dados
     *
     * @param database {@code String} Nome da base de dados
     */
    protected void setDatabase(String database) {
        this.database = database;
    }

    /**
     * Retorna o sufixo da base de dados (Extensão do arquivo)
     *
     * @return {@code String} sufixo da base de dados (Extensão do arquivo)
     */
    protected String getSufix() {
        return sufix;
    }

    /**
     * Modifica o sufixo da base de dados (Extensão do arquivo)
     *
     * @param sufix {@code String} Sufixo da base de dados (Extensão do arquivo)
     */
    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    @Override
    public Long getNextId() {
        ObjectContainer db = getClient();
        Query query = db.query();
        query = new QueryBuilder(query)
                .constrain(entity)
                .descend(id)
                .orderAscending()
                .ready();
        ObjectSet<T> set = query.execute();
        T get = set.get(0);
        if (get != null) {
            try {
                Field field = get.getClass().getDeclaredField("id");
                field.setAccessible(true);
                return (Long) field.get(get);
            } catch (NoSuchFieldException | SecurityException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
                return 1L;
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
                return 1L;
            }
        } else {
            return 1L;
        }
    }

}
