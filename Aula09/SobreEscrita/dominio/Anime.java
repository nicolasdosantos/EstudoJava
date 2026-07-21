package Aula09.SobreEscrita.dominio;

// "extends Object" aqui é so pra deixar explicito algo que o Java ja faz sozinho -
// toda classe que a gente cria ja herda de Object por baixo dos panos, mesmo sem
// escrever extends nenhum. É de Object que vem o toString() que da pra sobrescrever
// embaixo
public class Anime extends Object{
    public String nome;

    // sobrescrita (override) do toString() que toda classe ja recebe de Object -
    // por padrao ele devolve algo tipo "Aula09.SobreEscrita.dominio.Anime@1b6d3586"
    // (so o nome da classe + hash), inutil pra debug. Sobrescrevendo, o
    // System.out.println(anime) chama esse metodo automaticamente e imprime o que
    // a gente quiser. Muito usado em projetos reais pra facilitar log/debug de objetos
    @Override
    public String toString(){
        return "Anime: " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getnome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
