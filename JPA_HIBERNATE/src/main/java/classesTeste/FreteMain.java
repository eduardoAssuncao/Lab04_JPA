package classesTeste;

import classes.Cidade;
import classes.Cliente;
import classes.Frete;
import repositorio.RepositorioFrete;

import java.util.List;

public class FreteMain {
    public static void main(String[] args) {
        //SALVANDO OU ATULIZANDO INFORMAÇÃO NO BANCO
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete frete = repositorioFrete.buscarPorId(4);
        frete.setDescricao("CIF/FOB");

        repositorioFrete.salvar(frete);*/

        //-----------------------------------//

        //BUSACANDO FRETE PELO ID
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete frete = repositorioFrete.buscarPorId(4);

        System.out.println(frete);*/

        //-----------------------------------//

        //ADICIONANDO FRETE AO BANCO
        RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete f = new Frete();
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        Cidade cidade = new Cidade();
        cidade.setIdCidade(1);
        f.setDescricao("CIF");
        f.setPeso(10f);
        f.setValor(20f, 1);
        f.setCliente(cliente);
        f.setCidade(cidade);

        repositorioFrete.salvar(f);

        //-----------------------------------//

        //LISTAR TODOS OS FRETES
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();
        List<Frete> fretes = repositorioFrete.listarTodos();

        for (Frete frete : fretes) {
            System.out.println(frete);
        }*/
    }
}
