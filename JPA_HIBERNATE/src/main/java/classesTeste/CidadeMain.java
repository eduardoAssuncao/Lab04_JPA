package classesTeste;

import classes.Cidade;
import repositorio.RepositorioCidade;

import java.util.List;

public class CidadeMain {
    public static void main(String[] args) {
        //SALVANDO OU ATULIZANDO INFORMAÇÃO NO BANCO
        /*RepositorioCidade repositorioCidade = new RepositorioCidade();

        Cidade cidade = repositorioCidade.buscarPorId(3);
        cidade.setNome("Minas Gerais");

        repositorioCidade.salvar(cidade);*/

        //-----------------------------------//

        //BUSACANDO CIDADE PELO ID
        /*RepositorioCidade repositorioCidade = new RepositorioCidade();

        Cidade cidade = repositorioCidade.buscarPorId(3);

        System.out.println(cidade);*/

        //-----------------------------------//

        //ADICIONANDO CIDADE AO BANCO
        RepositorioCidade repositorioCidade = new RepositorioCidade();
        Cidade c = new Cidade();
        c.setNome("São Paulo");
        c.setTaxa(50.00f);
        c.setUF("SP");

        repositorioCidade.salvar(c);

        //-----------------------------------//

        //LISTAR TODOS AS CIDADES
        /*RepositorioCidade repositorioCidade = new RepositorioCidade();
        List<Cidade> cidades = repositorioCidade.listarTodos();

        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }*/
    }
}
