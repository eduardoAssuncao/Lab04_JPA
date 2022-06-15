package classesTeste;

import classes.Cidade;
import classes.Cliente;
import classes.Frete;
import repositorio.RepositorioFrete;
import services.RecuperarFretesCliente;
import services.RecuperarValorFrete;

import java.util.List;

public class FreteMain {
    public static void main(String[] args) {
        //SALVANDO, ATULIZANDO OU REMOVENDO INFORMAÇÃO NO BANCO
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete frete = repositorioFrete.buscarPorId(6);
        //frete.setDescricao("FOB");

        //repositorioFrete.remover(frete);
        System.out.println(frete);*/

        //-----------------------------------//

        //BUSACANDO FRETE PELO ID
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete frete = repositorioFrete.buscarPorId(4);

        System.out.println(frete);*/

        //-----------------------------------//

        //ADICIONANDO FRETE AO BANCO
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();

        Frete f = new Frete();
        Cliente cliente = new Cliente();
        cliente.setIdCliente(4);
        Cidade cidade = new Cidade();
        cidade.setIdCidade(3);
        f.setDescricao("CIF");
        f.setPeso(25f);
        f.setValor(12.4f, 3);
        f.setCliente(cliente);
        f.setCidade(cidade);

        repositorioFrete.salvar(f);*/

        //-----------------------------------//

        //LISTAR TODOS OS FRETES
        /*RepositorioFrete repositorioFrete = new RepositorioFrete();
        List<Frete> fretes = repositorioFrete.listarTodos();

        for (Frete frete : fretes) {
            System.out.println(frete);
        }*/

        /*RecuperarValorFrete recuperarValorFrete = new RecuperarValorFrete();
        List<Frete> fretes = recuperarValorFrete.listarFretes();
        Frete f = new Frete();
        for (Frete frete: fretes) {
            System.out.println(fretes);
            break;
        }*/

        //-----------------------------------//

        //RECUPERAR FRETE POR ID
        /*RecuperarValorFrete recuperarValorFrete = new RecuperarValorFrete();
        Frete frete = recuperarValorFrete.buscarFretePorId(9);

        System.out.println(frete);*/

        //LISTAR TODOS OS FRETES
        RecuperarFretesCliente recuperarFretesCliente = new RecuperarFretesCliente();
        List<Frete> fretes = recuperarFretesCliente.listarFretesCliente();

        for (Frete frete : fretes) {
            System.out.println(frete);
        }
    }
}
