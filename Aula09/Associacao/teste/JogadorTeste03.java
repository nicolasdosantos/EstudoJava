package Aula09.Associacao.teste;


import Aula09.Associacao.dominio.Jogador;
import Aula09.Associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cr7");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        // diferente do JogadorTeste02: aqui os dois lados da associação são montados na mão -
        // o jogador aponta pro time E o time aponta pro jogador. Java não sincroniza isso
        // sozinho, cada referência precisa ser setada separadamente
        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
