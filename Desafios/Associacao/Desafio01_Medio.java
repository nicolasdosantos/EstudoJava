package Desafios.Associacao;

/*
 * DESAFIO 01 — 🟡 Médio — Associação entre objetos
 * Cenário: Escola — Turmas e Alunos
 *
 * Crie Turma (nome, Aluno[] alunos) e Aluno (nome, referência Turma
 * turma). Um método em Turma imprime o nome de todos os alunos. No
 * main, monte a associação dos dois lados manualmente e imprima.
 * Array fixo, sem List/ArrayList ainda.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        Turma turma = new Turma("3º Ano Médio B");

        Aluno aluno1 = new Aluno("Nicolas");
        Aluno aluno2 = new Aluno("Miguel");
        Aluno aluno3 = new Aluno("Thiago");

        Aluno[] alunos = {aluno1,aluno2,aluno3};

        turma.setAlunos(alunos);

        // associação dos dois lados feita na mão, igual JogadorTeste03 da Aula09 - setar
        // turma.setAlunos(...) nao faz o aluno saber sua turma sozinho, cada referência
        // precisa ser setada separadamente
        aluno1.setTurma(turma);
        aluno2.setTurma(turma);
        aluno3.setTurma(turma);

        turma.imprime();
    }
}
