package Desafios.Aula04;

/*
 * DESAFIO 01 — 🟡 Médio — Operadores (Aula04)
 * Cenário: Caixa de Mercado
 *
 * Calcule o valor com desconto de uma compra, verifique se ela
 * atingiu o mínimo pra frete grátis e combine isso com "cliente
 * cadastrado" usando operador lógico. Ainda sem if/switch — só
 * guarde os resultados em boolean. Use ++ ou += num contador de itens.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {

        // Valor da compra
        double valorCompra = 150.0;

        // Percentual de desconto
        double percentualDesconto = 10.0;

        // Cliente é cadastrado?
        boolean clienteCadastrado = true;

        // Quantidade de itens comprados
        int quantidadeItens = 3;

        // Calculando o valor com desconto
        double valorComDesconto = valorCompra - (valorCompra * percentualDesconto / 100);

        // Verificando se atingiu o valor mínimo para frete grátis
        boolean freteGratis = valorComDesconto >= 100.0;

        // Combinando duas condições com operador lógico
        boolean podeReceberFreteGratis = freteGratis && clienteCadastrado;

        quantidadeItens++;

        // Exibindo os resultados
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto: " + percentualDesconto + "%");
        System.out.println("Valor com desconto: R$ " + valorComDesconto);
        System.out.println("Frete grátis: " + freteGratis);
        System.out.println("Cliente cadastrado: " + clienteCadastrado);
        System.out.println("Pode receber frete grátis: " + podeReceberFreteGratis);
        System.out.println("Quantidade de itens: " + quantidadeItens);
    }
}
