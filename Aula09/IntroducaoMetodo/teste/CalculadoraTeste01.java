import Aula09.IntroducaoMetodo.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // chama o metodo soma() da classe Calculadora
        calculadora.soma();
        calculadora.sub();
        calculadora.mult(5, 2);
        

    }
}
