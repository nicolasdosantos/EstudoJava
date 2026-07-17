

import Aula09.IntroducaoMetodo.dominio.Calculadora;

public class Calculadora02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // chama o metodo divi passando os dois numeros como parametro
        double result = calculadora.divi(20, 2);
        System.out.println(result);
    }
}
