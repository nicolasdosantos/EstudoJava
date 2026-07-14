public class Aula02{
    public static void main(String[] args) {


        // Tipo primitivos = int , double, float, char, byte, short, long, boolean
        int age = 10;
        // casting - Força o java a aceitar esse valor, porem ele corta os byte para fazer caber no valor int
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L; 
        double salario = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'O';

        // String é um tipo de referencia e não é um tipo primitivo(numerico)
        String nome = "Nicolas";

        var nome2 = "Teste";

        System.out.println("A idade é: " + age + " anos.");
        System.out.println("Meu nome é: " + nome);
    }
}