import Aula09.IntroducaoMetodo.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num[] = {1,2,3,4,5,};
        // somArray recebe um array já pronto
        calculadora.somArray(num);
        // somaVarArgs usa "int... num", que aceita quantos valores quiser sem precisar montar um array antes
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);

    }
}
