package domain;

import java.util.List;

public class Passagem {
    
    private Integer codigo;

    private Double valor;

    private String cpfCliente;

    private Passageiro passageiro;

    private List<Programacao> programacao;

    public Passagem(Integer codigo, Double valor, String cpfCliente, Passageiro passageiro) {
        this.codigo = codigo;
        this.valor = valor;
        this.cpfCliente = cpfCliente;
        this.passageiro = passageiro;
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

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public List<Programacao> getProgamacao() {
        return programacao;
    }

    public void setProgamacao(List<Programacao> progamacao) {
        this.programacao = progamacao;
    }

    @Override
    public String toString() {
        return "Passagem [codigo=" + codigo + ", valor=" + valor + ", cpfCliente=" + cpfCliente + "]";
    }

   
    
}
