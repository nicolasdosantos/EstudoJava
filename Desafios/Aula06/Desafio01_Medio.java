package Desafios.Aula06;

/*
 * DESAFIO 01 — 🟡 Médio — Repetição (Aula06)
 * Cenário: Banco — Processamento de Transações
 *
 * Some depósitos ao saldo num for/while até bater a meta (500.0) ou
 * 10 rodadas, usando break pra sair assim que a meta for atingida.
 * Depois, simule 1 tentativa de senha com do-while. Sem arrays ainda.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {

        double saldo = 100.0;
        double deposito = 50.0;
        double meta = 500.0;

        // Somando depósitos até atingir a meta ou completar 10 rodadas
        for (int rodada = 1; rodada <= 10; rodada++) {
            saldo += deposito;

            System.out.println("Rodada " + rodada + " - Saldo: R$ " + saldo);

            if (saldo >= meta) {
                System.out.println("Meta atingida!");
                break;
            }
        }

        // Simulando uma tentativa de senha
        int tentativa = 1;

        do {
            System.out.println("Tentativa de senha: " + tentativa);
            tentativa++;
        } while (tentativa <= 1);
    }
}
