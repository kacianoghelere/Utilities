package br.com.gmp.comps.data;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

/**
 * DAO generico para controladores de entidades baseadas em estruturas SQL.
 *
 * @author kaciano
 * @param <T>
 */
public class SqlDAO<T extends Object> implements DAO<T> {

    private final EntityManager em;
    private final Class<T> entity;
    private final Metamodel metamodel;
    private final EntityType<T> entity_;

    /**
     * Cria nova instancia de SqlDAO
     *
     * @param em {@code EntityManager} Gerenciador de entidades
     */
    public SqlDAO(EntityManager em) {
        this.em = em;
        this.entity = (Class<T>) ((ParameterizedType) (getClass()
                .getGenericSuperclass())).getActualTypeArguments()[0];
        this.metamodel = em.getMetamodel();
        this.entity_ = metamodel.entity(entity);
    }

    @Override
    public void delete(T entity) {
        try {
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteAll(List<T> entities) {
        try {
            em.getTransaction().begin();
            for (T ent : entities) {
                em.remove(ent);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteAll() {
        try {
            em.getTransaction().begin();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaDelete<T> delete = cb.createCriteriaDelete(entity);
            Root<T> from = delete.from(entity);
            em.createQuery(delete).executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<T> getList() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(entity);
        Root<T> from = query.from(entity);
        query.select(from);
        return em.createQuery(query).getResultList();
    }

    @Override
    public Object[] getArray() {
        return getList().toArray();
    }

    @Override
    public Class<T> getObjClass() {
        return entity;
    }

    @Override
    public void insert(T entity) {
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void insertAll(List<T> entities) {
        try {
            em.getTransaction().begin();
            for (T ent : entities) {
                em.persist(ent);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<T> queryByField(String field, Object value) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(entity);
        Root<T> from = query.from(entity);
        query.select(from);

        query.where(cb.equal(from.get(entity_.getSingularAttribute(field)), value));

        return em.createQuery(query).getResultList();
    }

    @Override
    public T queryByID(Long id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(entity);
        Root<T> from = query.from(entity);
        query.select(from);

        query.where(cb.equal(from.get(entity_.getId(entity)), id));

        return em.createQuery(query).setMaxResults(1).getSingleResult();
    }

    @Override
    public void replaceAll(List<T> entities) {
        try {
            em.getTransaction().begin();
            for (T ent : entities) {
                em.merge(ent);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void setObjClass(Class<T> oClass) {
    }

    @Override
    public void update(T entity) throws IllegalArgumentException, IllegalAccessException {
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public Long getNextId() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(entity);
        Root<T> from = query.from(entity);
        query.select(from.get(entity_.getDeclaredId(entity)));

        query.orderBy(cb.desc(from.get(entity_.getId(entity))));

        return ((Long) em.createQuery(query).setMaxResults(1).getSingleResult()) + 1L;
    }

}
