package domain;

import java.util.Date;

public class Programacao {

    private Date dataHoraPartida;

    private Date dataHoraChegada;

    private String nomeAeronave;

    private Integer limite;

    private Passagem passagem;

    private Voo voo;

    public Programacao(Date dataHoraPartida, Date dataHoraChegada, String nomeAeronave, Integer limite,
            Passagem passagem, Voo voo) {
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.nomeAeronave = nomeAeronave;
        this.limite = limite;
        this.passagem = passagem;
        this.voo = voo;
    }

    public Date getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Date dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public Date getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(Date dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getNomeAeronave() {
        return nomeAeronave;
    }

    public void setNomeAeronave(String nomeAeronave) {
        this.nomeAeronave = nomeAeronave;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Progamacao [dataHoraPartida=" + dataHoraPartida + ", dataHoraChegada=" + dataHoraChegada
                + ", nomeAeronave=" + nomeAeronave + ", limite=" + limite + ", passagem=" + passagem + ", voo=" + voo
                + "]";
    }
    
}
