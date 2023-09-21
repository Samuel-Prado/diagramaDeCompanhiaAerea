package domain;

import java.util.List;

public class Escala {
    
    private String poltrona;

    private List<Programacao> programacaos;

    public Escala(String poltrona) {
        this.poltrona = poltrona;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public List<Programacao> getProgramacaos() {
        return programacaos;
    }

    public void setProgramacaos(List<Programacao> programacaos) {
        this.programacaos = programacaos;
    }

    @Override
    public String toString() {
        return "Escala [poltrona=" + poltrona + "]";
    }

    
}
