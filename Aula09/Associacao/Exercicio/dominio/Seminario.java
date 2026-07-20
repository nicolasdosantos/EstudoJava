package Aula09.Associacao.Exercicio.dominio;


public class Seminario{
    private String titulo;
    // aqui tem duas associações ao mesmo tempo: "muitos" alunos (array) e "um" local (referência
    // unica) - o mesmo objeto pode se associar com outras classes de jeitos diferentes
    private Aluno aluno[];
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno aluno[], Local local){
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

    public void setAluno(Aluno aluno[]){
        this.aluno = aluno;
    }

    public Aluno[] getAluno(){
        return this.aluno;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public Local getLocal(){
        return this.local;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    
}