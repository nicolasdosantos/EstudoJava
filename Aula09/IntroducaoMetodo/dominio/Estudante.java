package Aula09.IntroducaoMetodo.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // agora o imprime() é metodo da propria classe Estudante, não precisa de uma classe separada pra isso
    public void imprime(){
        System.out.println("-----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
