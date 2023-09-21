package domain;

import java.util.List;

public class Voo {

    private String prefixo;

    private Aeroporto origem;

    private Aeroporto destino;

    private List<Programacao> programacaos;

    public Voo(String prefixo, Aeroporto origem, Aeroporto destino) {
        this.prefixo = prefixo;
        this.origem = origem;
        this.destino = destino;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public List<Programacao> getProgramacaos() {
        return programacaos;
    }

    public void setProgramacaos(List<Programacao> programacaos) {
        this.programacaos = programacaos;
    }

    @Override
    public String toString() {
        return "Voo [prefixo=" + prefixo + ", origem=" + origem + ", destino=" + destino + "]";
    }

    
}
