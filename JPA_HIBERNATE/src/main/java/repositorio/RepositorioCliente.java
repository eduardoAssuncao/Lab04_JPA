package repositorio;

import classes.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class RepositorioCliente {
    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioCliente(){
        emf = Persistence.createEntityManagerFactory("teste-jpa");
        em = emf.createEntityManager();
    }

    public Cliente buscarPorId(Integer id){
        em.getTransaction().begin();
        Cliente cliente = em.find(Cliente.class, id);
        em.getTransaction().commit();
        //emf.close();
        return cliente;
    }

    public void salvar(Cliente cliente){
        em.getTransaction().begin();
        em.merge(cliente);//ele atualiza a informação caso ela já exista
        em.getTransaction().commit();
        emf.close();
        //System.out.println("Salvo");
    }

    public void remover(Cliente c){
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> listarTodos(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select cliente from Cliente cliente");
        List<Cliente> clientes = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return clientes;
    }
}
