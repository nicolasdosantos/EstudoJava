package Aula09.Exercicio.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario[]; // array não inicializado começa null, por isso os métodos checam antes de usar

    public void imprime() {
        // this. aqui é opcional (não tem parametro com mesmo nome), só deixando explicito que é atributo da classe
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(salario == null){
            return;
        }
        for (double i : salario) {
            System.out.println(i + " ");
        }
    }

    public void media() {
        double media = 0;
        if (salario != null) {
            for (double d : salario) {
                media += d;
            }
            media /= salario.length;
        }

        System.out.println("Media: " + media);
    }
}
