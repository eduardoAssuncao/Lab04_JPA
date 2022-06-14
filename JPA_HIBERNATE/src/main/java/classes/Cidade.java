package classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCidade;
    @Column(length = 50, nullable = false, unique = true)
    private String nome;
    @Column(length = 10, nullable = false)
    private String UF;
    @Column(nullable = false)
    private float taxa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidade")
    private List<Frete> fretes;

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public List<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "idCidade=" + idCidade +
                ", nome='" + nome + '\'' +
                ", UF='" + UF + '\'' +
                ", taxa=" + taxa +
                '}';
    }
}
