package Desafios.POO;

/*
 * DESAFIO 01 — 🟢 Fácil — Classes e Objetos
 * Cenário: Locadora de Filmes
 *
 * Crie a classe Filme (titulo, genero, duracaoMinutos — atributos
 * públicos, sem encapsulamento ainda) com um método imprime(). No
 * main, instancie 2 filmes com new, atribuindo os campos direto, e
 * chame imprime() em cada um. Sem construtor próprio.
 */
public class Desafio01_Facil {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Filme filme2 = new Filme();


        filme.titulo = "Transformers";
        filme.genero = "Ação";
        filme.duracaoMinutos = 180;

        filme2.titulo = "Vingadores";
        filme2.genero = "Aventura";
        filme2.duracaoMinutos = 200;

        filme.imprime();
        filme2.imprime();

    }
}
