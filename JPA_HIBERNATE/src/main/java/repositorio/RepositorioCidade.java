package repositorio;

import classes.Cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RepositorioCidade {
    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioCidade(){
        emf = Persistence.createEntityManagerFactory("teste-jpa");
        em = emf.createEntityManager();
    }

    public Cidade buscarPorId(Integer id){
        em.getTransaction().begin();
        Cidade cidade = em.find(Cidade.class, id);
        em.getTransaction().commit();
        //emf.close();
        return cidade;
    }

    public void salvar(Cidade cidade){
        em.getTransaction().begin();
        em.merge(cidade);//ele atualiza a informação caso ela já exista
        em.getTransaction().commit();
        emf.close();
        //System.out.println("Salvo");
    }

    public void remover(Cidade c){
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    public List<Cidade> listarTodos(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select cidade from Cidade cidade");
        List<Cidade> cidades = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return cidades;
    }
}
