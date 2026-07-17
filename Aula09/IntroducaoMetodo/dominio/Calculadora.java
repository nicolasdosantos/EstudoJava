package Aula09.IntroducaoMetodo.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10 + 10);
    }

    public void sub() {
        System.out.println(20 - 10);
    }

    public void mult(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divi(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // public double divi2(double num1, double num2) {
    // if (num2 == 0) {
    // return 0;
    // } else {
    // return num1 / num2;
    // }
    // }

    //public void divi3(double num1, double num2) {
    //    if (num1 == 0 || num2 == 0) {
    //        System.out.println("Não existe divisão por 0!");
    //        return;
    //    }
    //    System.out.println(num1 / num2);
    //}

    public void alt(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
