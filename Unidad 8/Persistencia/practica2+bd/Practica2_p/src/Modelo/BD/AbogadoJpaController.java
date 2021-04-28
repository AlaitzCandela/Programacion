/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import Modelo.BD.exceptions.NonexistentEntityException;
import Modelo.BD.exceptions.PreexistingEntityException;
import ModeloUML.Abogado;
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
public class AbogadoJpaController implements Serializable {

    public AbogadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Abogado abogado) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(abogado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAbogado(abogado.getDni()) != null) {
                throw new PreexistingEntityException("Abogado " + abogado + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Abogado abogado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            abogado = em.merge(abogado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = abogado.getDni();
                if (findAbogado(id) == null) {
                    throw new NonexistentEntityException("The abogado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Abogado abogado;
            try {
                abogado = em.getReference(Abogado.class, id);
                abogado.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The abogado with id " + id + " no longer exists.", enfe);
            }
            em.remove(abogado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Abogado> findAbogadoEntities() {
        return findAbogadoEntities(true, -1, -1);
    }

    public List<Abogado> findAbogadoEntities(int maxResults, int firstResult) {
        return findAbogadoEntities(false, maxResults, firstResult);
    }

    private List<Abogado> findAbogadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Abogado.class));
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

    public Abogado findAbogado(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Abogado.class, id);
        } finally {
            em.close();
        }
    }

    public int getAbogadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Abogado> rt = cq.from(Abogado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
