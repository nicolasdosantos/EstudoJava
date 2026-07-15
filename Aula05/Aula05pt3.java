public class Aula05pt3 {
    public static void main(String[] args) {
        double salario = 3000;
        String msg = "Eu vou doar 500 reais ";
        String msgN = "Ainda não tenho condições! ";

        // operador ternario
        //                (    Condição   )
        String resultado = salario > 5000  ? msg : msgN;

        // boolean possoDoar = salario > 5000 ? true : false;

        //if(salario >= 5000){
        //    resultado = msg;
        //}
        //else{
        //    resultado = msgN;
        //}
        
        System.out.println(resultado);

    }
}
