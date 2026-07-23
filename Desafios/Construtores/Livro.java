package Desafios.Construtores;

public class Livro {
    /*
     * Crie Livro (titulo, autor, edicao) com construtor de 2 parâmetros
     * (edicao = 1 por padrão) e outro de 3, reaproveitando o de 2 via
     * this(...).
     */

    // atributos private - acesso só via get/set (aqui nem tem get/set, só é usado dentro da propria classe pelo imprime())
    private String titulo;
    private String autor;
    private int edicao = 1; // valor padrao da edicao - usado quando o construtor de 2 parametros é chamado

    // construtor de 2 parametros - como a classe ja tem construtor proprio, o Java NAO gera mais
    // o construtor vazio (Livro()) automatico
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    // sobrecarga de construtor - "this(...)" precisa ser a primeira linha do bloco e chama o construtor
    // de 2 parametros acima, evitando repetir as mesmas atribuicoes de titulo/autor
    public Livro(String titulo, String autor, int edicao){
        this(titulo, autor);
        this.edicao = edicao;

    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Edição: " + this.edicao);
    }

}
