import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import domain.Aeroporto;
import domain.Cidade;
import domain.Escala;
import domain.Passageiro;
import domain.Passagem;
import domain.Programacao;
import domain.Voo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse("23/09/2023");
        Date data2 = new SimpleDateFormat("dd/MM/yyyy").parse("23/10/2023");

        Passageiro passageiro = new Passageiro("Samuel Prado Soares", "230.194.035-34", "samuel@gmail.com");

        Passagem passagem = new Passagem(1, 1500.50, passageiro.getCpf(),passageiro);

        Cidade cidade1 = new Cidade(1, "Uberlândia", "713.232 habitantess");
        Cidade cidade2 = new Cidade(2, "João pessoa", "1 milhão de habitantes");

        Aeroporto aeroporto1 = new Aeroporto(1, "Aeroporto Tenente Coronel Aviador César Bombonato", "18° 53′ 1″ S, 48° 13′ 31″ W", cidade1);
        Aeroporto aeroporto2 = new Aeroporto(2, "Aeroporto Tente Presidente Castro Pinto", "7° 8′ 54″ S, 34° 57′ 2″ W", cidade2);

        Voo voo = new Voo("20493304", aeroporto1, aeroporto2);

        Programacao programacao = new Programacao(data1, data2, "KFT-354", 145, passagem, voo);

        Escala escala = new Escala("G-120");

        passageiro.setPassagens(Arrays.asList(passagem));

        passagem.setProgamacao(Arrays.asList(programacao));

        cidade1.setAeroportos(Arrays.asList(aeroporto1));
        cidade2.setAeroportos(Arrays.asList(aeroporto2));

        voo.setProgramacaos(Arrays.asList(programacao));

        escala.setProgramacaos(Arrays.asList(programacao));


        System.out.println(passageiro);
        System.out.println(passagem);
        System.out.println(cidade1);
        System.out.println(cidade2);
        System.out.println(aeroporto1);
        System.out.println(aeroporto2);
        System.out.println(voo);
        System.out.println(programacao);
        System.out.println(escala);
    }
}
