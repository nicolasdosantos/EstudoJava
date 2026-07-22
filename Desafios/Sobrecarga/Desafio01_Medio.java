package Desafios.Sobrecarga;

/*
 * DESAFIO 01 — 🟡 Médio — Sobrecarga de métodos
 * Cenário: Pedidos — Cálculo de Total
 *
 * Crie Pedido com calcularTotal(double valorProdutos) e uma versão
 * sobrecarregada calcularTotal(double valorProdutos, double
 * valorFrete), reaproveitando a primeira via this.calcularTotal(...).
 * No main, chame as duas e imprima os resultados.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();


        // com 1 argumento chama a versão de 1 parâmetro; com 2, o Java já resolve pra a sobrecarga certa
        System.out.println(pedido.calcularTotal(100));
        System.out.println(pedido.calcularTotal(100, 35));
    }
}
