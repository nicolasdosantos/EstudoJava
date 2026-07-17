public class Aula07pt3 {
    public static void main(String[] args) {
        int nums[] = new int[3]; // array vazio, valores default 0
        int nums2[] = {1,2,3}; // já cria o array com os valores
        int nums3[] = new int[]{1,2,3,4,5}; // outra forma de inicializar com valores

        // for tradicional, usando indice
        for(int i = 0; i < nums3.length; i++){
            System.out.println(nums3[i]);
        }

        // for-each, percorre os valores direto sem precisar do indice
        for (int i : nums3) {
            System.out.println(i);
        }
    }
}
