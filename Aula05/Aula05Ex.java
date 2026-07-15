public class Aula05Ex {
    public static void main(String[] args) {
        
        //€ 0      € 34,712        9.70%
        //€ 34,713   € 68,507        37.35%
        //€ 68,508   49.50%
        
        double salario = 25000;
        double primeiraFaixa = 9.70 / 100;
        double seungaFaixa = 37.35 / 100;
        double teceriraFaixa = 49.50 / 100;
        double result = 0;
        if (salario <= 34712){
            result = salario * primeiraFaixa;
        }
        else if(salario > 34712 && salario <= 68507){
            result =  salario * seungaFaixa;
        }
        else{
            result = salario * teceriraFaixa;
        }

        System.out.println(result);

    }
}
