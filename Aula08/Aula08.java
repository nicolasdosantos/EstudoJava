public class Aula08 {
    public static void main(String[] args) {
        // Arrays multidimencionais - um array dentro do outro
        // Array 1 - meses 
        // Array 2 - Dia

        int dias[][] = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 25;
        dias[1][2] = 15;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        
        System.out.println("\n --------------- \n");

        for (int[] is : dias) {
            for (int js : is) {
                System.out.println(js);
            }
        }
    }
}
