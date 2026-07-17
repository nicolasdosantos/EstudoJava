public class Aula08pt2 {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        // matriz sem definir o tamanho das colunas, cada linha pode ter um tamanho diferente
        int arryInt[][] = new int[3][];

        arryInt[0] = new int[]{1,2};
        arryInt[1] = array;
        arryInt[2] = new int[]{1,2,3,4,5,6};

        // mesma ideia de cima, só que já inicializando tudo direto
        int arryInt2[][] = {{1,2},{1,2,3},{1,2,3,4,5,6}};

        for (int[] is : arryInt2) {
            System.out.println("\n-----");
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
        }
    }
}
