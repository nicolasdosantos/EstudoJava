public class Aula04 {
    public static void main(String[] args) {
        // operadores aritimedicos +, -, /, *
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println(result);

        // Resto da divisão %
        int resto = 21 % 7;
        System.out.println(resto);

        // Operador relacionais(Sempre retorna valores booleanos) <,  >, <=, >=, ==, != 
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaior Que Vinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenor Que Vinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // Operadores logicos &&(and), || (or), !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentro DaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentro DaLei Menor QueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+ isPlaystationCincoCompravel);

        // Operadoes de atribuição =, +=, -=, *=, /=, %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--; // contador = contador - 1;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
