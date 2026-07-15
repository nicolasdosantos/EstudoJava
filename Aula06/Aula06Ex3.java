public class Aula06Ex3 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas parcelas podem ser feitas
        // Condição é de valorParcela >= 1000

        double valor = 30000;
        for (int parcela = 1; parcela <= valor; parcela++) {
            double valorParcela = valor / parcela;
            if (valorParcela >= 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + ": " + " R$" + valorParcela);

        }
    }
}
