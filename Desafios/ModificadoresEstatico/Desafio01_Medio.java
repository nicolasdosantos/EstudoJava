package Desafios.ModificadoresEstatico;

/*
 * DESAFIO 01 — 🟡 Médio — Modificador static
 * Cenário: Banco — Contador de Contas
 *
 * Crie Conta (titular de instância) com static int
 * totalContasAbertas incrementado a cada new, static final double
 * TAXA_MANUTENCAO, bloco static { } que imprime "Banco iniciado" e
 * static int getTotalContasAbertas(). No main, crie 3 contas e
 * imprima o total pelo método estático (nunca pelo objeto).
 */
public class Desafio01_Medio {

    public static void main(String[] args) {

        Conta conta1 = new Conta("Nicolas");
        Conta conta2 = new Conta("Maria");
        Conta conta3 = new Conta("João");

        // chamado direto pelo nome da classe (Conta.getTotalContasAbertas()), nunca
        // por conta1.getTotalContasAbertas() - membro static nao depende de nenhum
        // objeto especifico pra existir, entao acessar via instancia so confunde
        // sobre o que de fato esta sendo compartilhado
        System.out.println("Total de contas: " + Conta.getTotalContasAbertas());
        System.out.println("Taxa de manutenção: R$ " + Conta.TAXA_MANUTENCAO);
    }
}
