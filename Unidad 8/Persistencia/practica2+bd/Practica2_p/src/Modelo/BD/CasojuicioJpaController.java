/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import Modelo.BD.exceptions.NonexistentEntityException;
import Modelo.BD.exceptions.PreexistingEntityException;
import ModeloUML.Casojuicio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Alaitzutzu
 */
public class CasojuicioJpaController implements Serializable {

    public CasojuicioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Casojuicio casojuicio) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(casojuicio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCasojuicio(casojuicio.getNumExp()) != null) {
                throw new PreexistingEntityException("Casojuicio " + casojuicio + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Casojuicio casojuicio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            casojuicio = em.merge(casojuicio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = casojuicio.getNumExp();
                if (findCasojuicio(id) == null) {
                    throw new NonexistentEntityException("The casojuicio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Casojuicio casojuicio;
            try {
                casojuicio = em.getReference(Casojuicio.class, id);
                casojuicio.getNumExp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The casojuicio with id " + id + " no longer exists.", enfe);
            }
            em.remove(casojuicio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Casojuicio> findCasojuicioEntities() {
        return findCasojuicioEntities(true, -1, -1);
    }

    public List<Casojuicio> findCasojuicioEntities(int maxResults, int firstResult) {
        return findCasojuicioEntities(false, maxResults, firstResult);
    }

    private List<Casojuicio> findCasojuicioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Casojuicio.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Casojuicio findCasojuicio(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Casojuicio.class, id);
        } finally {
            em.close();
        }
    }

    public int getCasojuicioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Casojuicio> rt = cq.from(Casojuicio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
