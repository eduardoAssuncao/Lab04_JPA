package services;

import classes.Cliente;
import classes.Frete;
import org.hibernate.query.QueryParameter;

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

    @SuppressWarnings("unchecked")
    public List<Frete> listarFretesCliente(int id) {
        em.getTransaction().begin();
        Query consulta = em.createQuery("select frete from Frete frete where idCliente = :idCliente");
        List<Frete> fretes = consulta.setParameter("idCliente", id).getResultList();
        em.getTransaction().commit();
        emf.close();
        return fretes;
    }
}
