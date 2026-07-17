package Aula09.IntroducaoMetodo.dominio;

public class Pessoa {
    // atributos private - diferente das classes anteriores (Estudante, Carro), aqui só dá pra
    // acessar nome e idade por fora usando os metodos get/set, nunca pessoa.nome direto
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // esse if é o motivo de existir o set: com atributo public qualquer um seta idade negativa
    // sem ninguem barrar, aqui o set valida antes de guardar o valor
    public void setIdade(int  idade){
        if(idade < 0){
            System.out.println("Idade invalida! ");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
