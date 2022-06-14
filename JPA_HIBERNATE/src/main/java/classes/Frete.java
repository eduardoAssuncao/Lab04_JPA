package classes;

import repositorio.RepositorioCidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Frete implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFrete;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private float peso;
    @Column(nullable = false)
    private float valor;

    @ManyToOne
    @JoinColumn(name="idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="idCidade", nullable = false)
    private Cidade cidade;

    public int getIdFrete() {
        return idFrete;
    }



    public void setIdFrete(Integer idFrete) {
        this.idFrete = idFrete;
    }

//    public int getIdCidade() {
//        return idCidade;
//    }
//
//    public void setIdCidade(int idCidade) {
//        this.idCidade = idCidade;
//    }
//
//    public int getIdCliente() {
//        return idCliente;
//    }
//
//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getValor() {
        return valor;
    }

//    public void setValor(float valor) {
//        this.valor = valor;
//    }
    public void setValor(float valor, Integer id) {
        RepositorioCidade repositorioCidade = new RepositorioCidade();

        Cidade cidade = repositorioCidade.buscarPorId(id);
        this.valor = (peso * 10) + cidade.getTaxa();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Frete{" +
                "idFrete=" + idFrete +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", valor=" + valor +
                ", cliente=" + cliente +
                ", cidade=" + cidade +
                '}';
    }
}
