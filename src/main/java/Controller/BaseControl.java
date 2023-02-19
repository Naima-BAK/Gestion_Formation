package Controller;



import Bean.Formation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BaseControl {


    public void edit(Formation entity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("def");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entityManager.find(Formation.class, entity.getId()));
        entityManager.getTransaction().commit();
    }

    public Formation insert(final Formation entity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("def");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return entity;
    }
    public List<Formation> findAll() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("def");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createQuery("Select t from Formation t").getResultList();
    }

    public void remove(Formation entity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("def");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Formation.class, entity.getId()));
        entityManager.getTransaction().commit();
    }

}
