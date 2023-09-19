package domain;

import java.util.List;

public class Passageiro {
    
    private String nome;

    private String cpf;

    private String email;

    private List<Passagem> passagens;

    public Passageiro(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }

    @Override
    public String toString() {
        return "Passageiro [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", passagens=" + passagens + "]";
    }

    
}
