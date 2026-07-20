package Aula09.Associacao.teste;

import Aula09.Associacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Cr7");

        Jogador[] jogadores = { jogador1, jogador2, jogador3 };

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }

}
