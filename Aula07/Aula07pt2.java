public class Aula07pt2 {
    public static void main(String[] args) {
        // byte, short, int , long, float, double = 0
        // char '\u0000' - imprime espaço em branco = ' '
        // boolean = false
        // String = null

        int idades[] = new int[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String nomes[] = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Luffy";
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
