package Desafios.Aula07;

/*
 * DESAFIO 01 — 🟡 Médio — Arrays (Aula07)
 * Cenário: Escola — Boletim de Notas
 *
 * Crie um double[] com 5 notas, some com for indexado, imprima cada
 * nota com for-each e calcule a média, informando "Aprovado" ou
 * "Reprovado" (média >= 6.0) com if. Tudo dentro do main.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        // Notas do aluno
        double notas[] = new double[]{5,6,7,8,9};
        double soma = 0;

        // Somando as notas com for indexado
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        double media = soma / notas.length;

        // Imprimindo cada nota individualmente com for-each
        for (double d : notas) {
            System.out.println("Nota " + d);
        }

        // Verificando aprovação pela média
        if(media >= 6.0){
            System.out.println("Média de " + media + " Aprovado! ");

        }
        else{
            System.out.println("Média de " + media + " Reprovado! ");
        }


    }
}
