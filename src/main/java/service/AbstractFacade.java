package service;

import jakarta.persistence.EntityManager;

import javax.inject.Inject;
import java.util.List;

public abstract class AbstractFacade<T> {
    @Inject
    protected EntityManager em;

    private Class<T> entityClass;
    @Inject
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    //protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        this.em.persist(entity);
    }

    public void edit(T entity) {
        this.em.merge(entity);
    }

    public void remove(T entity) {
        this.em.remove(this.em.merge(entity));
    }

    public T find(Object id) {
        return this.em.find(entityClass, id);
    }

    public List<T> findAll() {
        jakarta.persistence.criteria.CriteriaQuery cq = this.em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return this.em.createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        jakarta.persistence.criteria.CriteriaQuery cq = this.em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        jakarta.persistence.Query q = this.em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        jakarta.persistence.criteria.CriteriaQuery cq = this.em.getCriteriaBuilder().createQuery();
        jakarta.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(this.em.getCriteriaBuilder().count(rt));
        jakarta.persistence.Query q = this.em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();

    }
}
