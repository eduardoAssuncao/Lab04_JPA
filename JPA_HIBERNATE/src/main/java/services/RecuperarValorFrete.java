package services;

import classes.Frete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RecuperarValorFrete {
    EntityManagerFactory emf;
    EntityManager em;

    public RecuperarValorFrete() {
        emf = Persistence.createEntityManagerFactory("teste-jpa");
        em = emf.createEntityManager();
    }

    public Frete buscarFretePorId(Integer id) {
        em.getTransaction().begin();
        Frete frete = em.find(Frete.class, id);
        em.getTransaction().commit();
        //emf.close();
        return frete;
    }

    @SuppressWarnings("unchecked")
    public List<Frete> listarFretes() {
        em.getTransaction().begin();
        Query consulta = em.createQuery("select valor from Frete valor");
        List<Frete> fretes = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return fretes;
    }

    @SuppressWarnings("unchecked")
    public List<Frete> listarFretesPorId(int id) {
        em.getTransaction().begin();
        Query consulta = em.createQuery("select valor from Frete valor where idFrete = :idFrete");
        List<Frete> fretes = consulta.setParameter("idFrete", id).getResultList();
        em.getTransaction().commit();
        emf.close();
        return fretes;
    }
}
