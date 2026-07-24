package Desafios.Associacao;

public class Turma {
    private String nome;
    // associação de "muitos" - uma Turma tem varios Alunos, por isso e array em vez de
    // uma referência unica (diferente de Aluno.turma, que e "um" so)
    private Aluno[] alunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    // cuidado: diferente do Time/Escola da Aula09, aqui nao tem check de alunos == null
    // antes do for - se imprime() for chamado sem setAlunos() antes, da NullPointerException
    public void imprime() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
