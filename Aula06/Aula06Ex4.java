public class Aula06Ex4 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas parcelas podem ser feitas
        // Condição é de valorParcela >= 1000
        double valor = 30000;
        for (int parcela = (int) valor; parcela >= 1; parcela--) {
            double valorParcela = valor / parcela;
            if (valorParcela >= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + ": " + " R$" + valorParcela);
            }

        }

}
