package repositorio;


import classes.Frete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RepositorioFrete {
    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioFrete(){
        emf = Persistence.createEntityManagerFactory("teste-jpa");
        em = emf.createEntityManager();
    }

    public Frete buscarPorId(Integer id){
        em.getTransaction().begin();
        Frete frete = em.find(Frete.class, id);
        em.getTransaction().commit();
        //emf.close();
        return frete;
    }

    public void salvar(Frete frete){
        em.getTransaction().begin();
        em.merge(frete);//ele atualiza a informação caso ela já exista
        em.getTransaction().commit();
        emf.close();
        //System.out.println("Salvo");
    }

    public void remover(Frete f){
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    public List<Frete> listarTodos(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select frete from Frete frete");
        List<Frete> fretes = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return fretes;
    }
}
