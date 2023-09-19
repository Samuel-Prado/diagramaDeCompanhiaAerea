package domain;

import java.util.List;

public class Cidade {

    private Integer codigo;

    private String nome;

    private String populacao;

    private List<Aeroporto> aeroportos;

    public Cidade(Integer codigo, String nome, String populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public List<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(List<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }

    @Override
    public String toString() {
        return "Cidade [codigo=" + codigo + ", nome=" + nome + ", populacao=" + populacao + ", aeroportos=" + aeroportos
                + "]";
    }

    
}
