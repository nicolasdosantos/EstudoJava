package Desafios.Construtores;

/*
 * DESAFIO 01 — 🟡 Médio — Construtores
 * Cenário: Biblioteca — Cadastro de Livro
 *
 * Crie Livro (titulo, autor, edicao) com construtor de 2 parâmetros
 * (edicao = 1 por padrão) e outro de 3, reaproveitando o de 2 via
 * this(...). No main, crie 1 livro com cada construtor e imprima os
 * dados. Sem construtor vazio.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        // aqui chama o construtor de 2 parametros - edicao fica no valor padrao (1)
        Livro livro1 = new Livro("Java Efetivo", "Joshua Bloch");
        // aqui chama o construtor de 3 parametros, que por baixo dos panos reaproveita o de 2 via this(...)
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 2);

        livro1.imprime();
        livro2.imprime();
    }
}
