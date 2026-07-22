package Desafios.POO;

public class Filme {
    /* Crie a classe Filme (titulo, genero, duracaoMinutos — atributos
    * públicos, sem encapsulamento ainda) com um método imprime()*/

    // atributos public de propósito, ainda sem encapsulamento - dá pra acessar e mudar
    // filme.titulo direto de fora da classe. É o ponto de partida antes de aprender private/get/set
    public String titulo;
    public String genero;
    public int duracaoMinutos;

    public void imprime(){
        System.out.println("------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Duração(Minutos): " + this.duracaoMinutos);
    }


}
