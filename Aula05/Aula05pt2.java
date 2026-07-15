public class Aula05pt2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >=15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto

        int idade = 17;
        String categoria;
        
        if(idade < 15){
            categoria = "infantil";
        }
        else if (idade >=15 && idade < 18) {
            categoria = "juvenil";
        }
        else{
            categoria = "adulta";
        }

        // categoria = idade < 15 ? "Categoria Infantil " : idade >= 15 && idade < 18 ? "Categoria Juvenil": "Categoria Adulto";

        System.out.println(categoria);
    }
}
