public class Aula06Ex2 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. por exemplo 50

        int max = 50;
        for(int i = 0; i <= max; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
