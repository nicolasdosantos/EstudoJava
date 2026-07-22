package Desafios.Aula02;

/*
 * DESAFIO 01 — 🟢 Fácil — Tipos primitivos, casting e variáveis (Aula02)
 * Cenário: Estoque de Mercado
 *
 * Calcule o valor total do estoque (quantidade * preço unitário) e
 * simule a leitura de uma balança: uma quantidade double convertida
 * para int via casting (lembre que trunca, não arredonda). Use var
 * em pelo menos uma variável.
 */
public class Desafio01_Facil {
    public static void main(String[] args) {
        int quantidade = 50;
        double precoUnitario = 7.50;

        double quantidadeMedidaBalanca = 12.8;
        int quantidadeInteiraBalanca = (int) quantidadeMedidaBalanca;

        var valorTotal = quantidade * precoUnitario;

        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Valor total do estoque: R$ " + valorTotal);
        System.out.println("Valor da balança lido como Double: " + quantidadeMedidaBalanca);
        System.out.println("Valor da balança convertido para Int (truncado): " + quantidadeInteiraBalanca);
    }

}
