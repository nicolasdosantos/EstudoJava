import Aula09.IntroducaoMetodo.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alt(num1, num2);
        System.out.println(num1 + " - " + num2);
        // variaveis do tipo primitivo não passa a referencia ou valor para ser mais claro
        // Ela cria apenas uma copia da variavel, a varialvel original não vai ser alterada - apenas copia o tamanho
    }
}
