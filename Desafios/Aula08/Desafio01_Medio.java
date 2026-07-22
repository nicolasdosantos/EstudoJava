package Desafios.Aula08;

/*
 * DESAFIO 01 — 🟡 Médio — Arrays multidimensionais (Aula08)
 * Cenário: Cinema — Mapa de Assentos
 *
 * Crie um int[][] 4x5 (0 = livre, 1 = ocupado), percorra com for
 * aninhado contando os livres e imprimindo o mapa linha por linha.
 * Matriz retangular fixa, sem arrays jagged.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        // Mapa de assentos 4x5 (0 = livre, 1 = ocupado)
        int assento[][] = new int[4][5];

        // Preenchendo a fileira 0 manualmente
        assento[0][0] = 1;
        assento[0][1] = 0;
        assento[0][2] = 1;
        assento[0][3] = 0;
        assento[0][4] = 1;

        // Preenchendo a fileira 1
        assento[1][0] = 0;
        assento[1][1] = 1;
        assento[1][2] = 0;
        assento[1][3] = 1;
        assento[1][4] = 0;

        // Preenchendo a fileira 2
        assento[2][0] = 1;
        assento[2][1] = 1;
        assento[2][2] = 0;
        assento[2][3] = 0;
        assento[2][4] = 1;

        // Preenchendo a fileira 3
        assento[3][0] = 0;
        assento[3][1] = 0;
        assento[3][2] = 1;
        assento[3][3] = 1;
        assento[3][4] = 0;

        int livre = 0;
        int ocupado = 0;

        // Percorrendo a matriz com for aninhado: conta livres e imprime o mapa
        for (int i = 0; i < assento.length; i++) {
            System.out.println("Fileira " + i + ": ");
            for (int j = 0; j < assento[i].length; j++) {
                if (assento[i][j] == 0) {
                    livre += 1;
                }
                System.out.print(assento[i][j] + " ");

            }
            System.out.println("\n ");
        }

        System.out.println("Assentos Livre: " + livre);
    }
}
