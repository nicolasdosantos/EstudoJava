public class Aula05pt4Ex {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo - Fim de semana");
                break;
            case 2:
                System.out.println("Segunda - dia util");
                break;
            case 3:
                System.out.println("Terça - dia util");
                break;
            case 4:
                System.out.println("Quarta - dia util");
                break;
            case 5:
                System.out.println("Quinta - dia util");
                break;
            case 6:
                System.out.println("Sexta - dia util");
                break;
            case 7:
                System.out.println("Sabado - Fim de semana");
            default:
                System.out.println("Dia invalido");
                break;
        }


        // Outra forma mais simples de fazer porem limitada e mais geral sem ser especifica
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
        
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
