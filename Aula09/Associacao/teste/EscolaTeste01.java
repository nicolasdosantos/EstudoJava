package Aula09.Associacao.teste;

import Aula09.Associacao.dominio.Escola;
import Aula09.Associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Nicolas");
        Professor[] professores = {professor};
        Escola escola = new Escola("Sale", professores);

        escola.imprime();


    }
}
