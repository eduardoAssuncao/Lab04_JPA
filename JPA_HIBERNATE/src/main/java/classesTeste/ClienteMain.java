package classesTeste;

import classes.Cliente;
import repositorio.RepositorioCliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClienteMain {
    public static void main(String[] args) {

        //SALVANDO OU ATULIZANDO INFORMAÇÃO NO BANCO
        /*RepositorioCliente repositorioCliente = new RepositorioCliente();

        Cliente cliente = repositorioCliente.buscarPorId(3);
        cliente.setNomeCliente("Carlos");

        repositorioCliente.salvar(cliente);*/

        //-----------------------------------//

        //BUSACANDO CLIENTE PELO ID
        /*RepositorioCliente repositorioCliente = new RepositorioCliente();

        Cliente cliente = repositorioCliente.buscarPorId(4);

        System.out.println(cliente);*/

        //-----------------------------------//

        //ADICIONANDO CLIENTE AO BANCO
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        Cliente c2 = new Cliente(null, "Eduardo", "Cohama", "999");

        repositorioCliente.salvar(c2);

        //-----------------------------------//

        //LISTAR TODOS OS CLIENTES
        /*RepositorioCliente repositorioCliente = new RepositorioCliente();
        List<Cliente> clientes = repositorioCliente.listarTodos();

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }*/
    }
}
