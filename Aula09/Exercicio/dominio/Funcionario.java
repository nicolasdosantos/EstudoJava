package Aula09.Exercicio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario[]; // array não inicializado começa null, por isso os métodos checam antes de usar
    private double media = 0; // antes era variavel local do metodo media(), virou atributo pra poder expor via getMedia()

    public void imprime() {
        // this. aqui é opcional (não tem parametro com mesmo nome), só deixando
        // explicito que é atributo da classe
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            return;
        }
        for (double i : salario) {
            System.out.println(i + " ");
        }
    }

    public void media() {
        if (salario != null) {
            for (double d : salario) {
                media += d;
            }
            this.media /= salario.length;
        }

        System.out.println("Media: " + media);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return this.salario;
    }

    public void setSalario(double salario[]) {
        this.salario = salario;
    }

    // só get, sem set - media é calculada dentro do metodo media(), não faz sentido setar de fora
    public double getMedia() {
        return this.media;
    }

}
