package Desafios.LeituraDados;

import java.util.Scanner;

/*
 * DESAFIO 01 — 🟢 Fácil — Leitura de dados (Scanner)
 * Cenário: Cadastro Interativo de Cliente
 *
 * Leia pelo teclado com Scanner: nome (nextLine()), idade (nextInt())
 * e a inicial do gênero de filme preferido (next().charAt(0)).
 * Imprima um resumo e feche o Scanner ao final. Cuidado com a mistura
 * de nextInt/nextLine no buffer.
 */
public class Desafio01_Facil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome?: ");
        String nome = input.nextLine();
        System.out.println("Qual sua idade?: ");
        // nextInt() so consome o numero digitado, o "\n" do enter fica no buffer - se
        // depois desse nextInt() eu chamasse nextLine() de novo, ia vir vazio (pegando
        // so aquele "\n" que sobrou). Aqui nao tem problema porque nextInt() e o ultimo
        // input lido, mas e um erro classico quando se mistura nextInt/nextLine em sequencia
        int idade = input.nextInt();

        System.out.println("Qual seu gênero de filme preferido? (A-Ação, C-Comédia, T-Terror): ");
        // next() pula espaços/quebra de linha antes de ler a proxima palavra, entao o "\n"
        // que sobrou do nextInt() nao é problema aqui - so seria se o proximo passo fosse
        // nextLine(), que nao pula esse delimitador e leria a linha vazia
        char generoFilme = input.next().charAt(0);

        System.out.println("---------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero de filme preferido: " + generoFilme);

        // fecha o Scanner ao final, liberando o recurso do teclado (System.in) - boa
        // pratica pra qualquer Scanner aberto, mesmo em programas curtos como este
        input.close();
    }
}
