package Aula09.LeituraDados;

import java.util.Scanner;

public class LeituraDados02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        // cuidado: se o usuario so der enter sem digitar nada, charAt(0) da erro
        // (StringIndexOutOfBoundsException) porque a String fica vazia e nao tem indice 0
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
