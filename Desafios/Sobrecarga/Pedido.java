package Desafios.Sobrecarga;

public class Pedido {
    /*
     * Crie Pedido com calcularTotal(double valorProdutos) e uma versão
     * sobrecarregada calcularTotal(double valorProdutos, double valorFrete),
     * reaproveitando a primeira via this.calcularTotal(...).
     */

    private double valorProdutos;
    private double valorFrete;

    public double calcularTotal(double valorProdutos){
        return valorProdutos;
    }

    // sobrecarga (overloading) - mesmo nome "calcularTotal", assinatura diferente (mais um
    // parametro). O this.calcularTotal(valorProdutos) reaproveita a versão de cima em vez
    // de repetir a lógica, então se ela mudar um dia só precisa mexer em um lugar
    public double calcularTotal(double valorProdutos, double valorFrete){
        return this.calcularTotal(valorProdutos) + valorFrete;
    }
}
