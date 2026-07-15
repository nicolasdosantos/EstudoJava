public class Aula05pt4 {
    public static void main(String[] args) {
        // imprima o dia da semana, consedirando o 1 como domingo

        byte dia = 43;
        // Valores que o switch aceita:
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Homem! ");
                break;
            case 'F':
                System.out.println("Mulher! ");
                break;
            default:
                System.out.println("Invalido! ");
                break;
        }

    }
}
