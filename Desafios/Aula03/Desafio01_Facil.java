package Desafios.Aula03;

/*
 * DESAFIO 01 — 🟢 Fácil — Strings e concatenação (Aula03)
 * Cenário: Cadastro de Cliente
 *
 * Monte e imprima uma mensagem de boas-vindas combinando nome, idade
 * e saldo inicial num único texto, só com "+". Cuidado: "+" com
 * String vira concatenação, com número vira soma.
 */
public class Desafio01_Facil {
    public static void main(String[] args) {

        // Dados do cliente recém-cadastrado
        String nome = "Nicolas";
        int idade = 19;
        double saldo = 505.25;

        // Concatenando tudo numa única mensagem de boas-vindas
        System.out.println("Bem vindo(a), " + nome + "! - Idade: " + idade + " anos. Saldo inicial: R$" + saldo);

    }
}
