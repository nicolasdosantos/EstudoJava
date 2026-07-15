public class Aula05 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        
        if (isAutorizadoComprarBebida == false){ 
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizo a comprar bebeida alcólica! ");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que não deve ser feito! ");
        }

        System.out.println("Fora do if");
    }
}
