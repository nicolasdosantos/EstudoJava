package Aula09.Associacao.Exercicio.teste;

import Aula09.Associacao.Exercicio.dominio.Aluno;
import Aula09.Associacao.Exercicio.dominio.Local;
import Aula09.Associacao.Exercicio.dominio.Professor;
import Aula09.Associacao.Exercicio.dominio.Seminario;

public class ExercTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua teste");
        Aluno aluno = new Aluno("Nicolas", 19);
        Professor professor = new Professor("Luis", "Java", null);
        Aluno alunos[] = {aluno};
        Seminario seminario = new Seminario("Programação em Java", alunos, local);
        Seminario seminarios[] = {seminario};
        professor.setSeminario(seminarios);

        professor.imprime();
    }
}
