package classesTeste;

import classes.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bdfrete");
//        EntityManager manager = factory.createEntityManager();
//
//        manager.getTransaction().begin();

        //Cliente c1 = new Cliente(null, "Eduardo", "Manuel Beckman", "98987234495");
        //Cliente c2 = new Cliente(null, "Carlos", "Alemanha", "989887373");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        //em.persist(c1);
        //em.persist(c2);
        em.getTransaction().commit();
//        System.out.println("Cadastrado com sucesso!");

        //consultar
//        Cliente c = em.find(Cliente.class, 3);
//
//        System.out.println(c);

        em.close();
        emf.close();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdfrete");
//        EntityManager em = emf.createEntityManager();
//
//        em.persist(c1);
//

//        manager.persist(c1);
//
//        manager.getTransaction().commit();
//
//        manager.close();
//        factory.close();
//
        System.out.println("Cadastrado com sucesso!");

    }
}
