package Desafios.Metodos;

public class CalculadoraBanco {
    // varargs (double... valores) - deixa chamar somarDepositos com 0, 1 ou quantos valores
    // quiser, sem precisar montar um array antes. Por dentro o Java trata "valores" como
    // um array normal, por isso o for-each funciona igual
    public double somarDepositos(double... valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }

        return soma;
    }

    public void relatorio(String cliente, double total) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Total depositado: R$ " + total);
        System.out.println("---------------------------");
    }
}
