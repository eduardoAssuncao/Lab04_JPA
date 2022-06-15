package services;

import classes.Frete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RecuperarFretesCliente {
    EntityManagerFactory emf;
    EntityManager em;

    public RecuperarFretesCliente() {
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
    public List<Frete> listarFretesCliente(int id) {
        em.getTransaction().begin();
        Query consulta = em.createQuery("select frete from Frete frete where idCliente = id");
        List<Frete> fretes = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return fretes;
    }
}
