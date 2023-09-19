package domain;

import java.util.List;

public class Passagem {
    
    private Integer codigo;

    private Double valor;

    private Passageiro passageiro;

    private List<Voo> voos;

    public Passagem(Integer codigo, Double valor, Passageiro cpf) {
        this.codigo = codigo;
        this.valor = valor;
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Passageiro getCpf() {
        return cpf;
    }

    public void setCpf(Passageiro cpf) {
        this.cpf = cpf;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    @Override
    public String toString() {
        return "Passagem [codigo=" + codigo + ", valor=" + valor + ", cpf=" + cpf + ", voos=" + voos + "]";
    }
    
}
