package classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para o JPA gere a chave primaria automaticamente
    private Integer idCliente;
    @Column(length = 50, nullable = false, unique = true)
    private String nomeCliente;
    @Column(length = 50, nullable = false, unique = true)
    private String enderecoCliente;
    @Column(length = 50, nullable = false, unique = true)
    private String telefoneCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Frete> fretes;

//    @OneToMany
//    @JoinTable(name="Cliente_Frete",
//        joinColumns = @JoinColumn(name="Cliente_Id"),
//        inverseJoinColumns = @JoinColumn(name="Frete_Id"))
//    private Collection<Frete> fretes;


    public Cliente() {
        super();
    }

    public Cliente(Integer idCliente, String nomeCliente, String enderecoCliente, String telefoneCliente) {
        super();
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public List<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoCliente='" + enderecoCliente + '\'' +
                ", telefoneCliente='" + telefoneCliente + '\'' +
                '}';
    }
}
