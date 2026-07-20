package Aula09.Associacao.teste;

import Aula09.Associacao.dominio.Jogador;
import Aula09.Associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos");

        // a associação aqui é só de um lado: o jogador sabe o time dele, mas o objeto time
        // criado acima continua sem saber que jogador1 faz parte dele (jogadores fica null)
        jogador1.setTime(time);

        jogador1.imprime();
    }   
}
