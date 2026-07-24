package Desafios.Associacao;

public class Aluno {
    private String nome;
    // associação: Aluno guarda uma referência pra Turma, é assim que Java liga um objeto
    // no outro - não é join automatico de banco, o objeto tem que apontar direto pra referência
    private Turma turma;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }
}
