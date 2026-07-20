package Aula09.LeituraDados;

import java.util.Scanner;

public class LeituraDados01 {
    public static void main(String[] args) {
        // Scanner é a classe padrão do Java pra ler entrada do teclado (System.in) -
        // parecido com input()/prompt() de outras linguagens, só que tipado: cada tipo de
        // dado tem seu proprio metodo de leitura (nextLine, nextInt, next...)
        Scanner input = new Scanner(System.in);

        System.out.println("---- Nome: ----");
        String nome = input.nextLine();
        System.out.println(nome);

        System.out.println("---- Idade: ----");
        int idade = input.nextInt();
        System.out.println(idade);

        System.out.println("---- Sexo(M/F): ----");
        // next() le só uma palavra (para no espaço) e charAt(0) pega o primeiro caractere -
        // assim da pra guardar M/F num char em vez de precisar de uma String inteira
        char sexo = input.next().charAt(0);

        System.out.println("---- Dados: ----");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
    }
}
