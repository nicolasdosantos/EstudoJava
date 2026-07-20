package Aula09.ModificadoresEstatico.dominio;

public class Carro{
    private String nome;
    private double veloMax;
    // static - esse atributo não pertence a cada Carro, pertence a propria classe Carro
    // por isso é UM valor só, compartilhado por todos os objetos (diferente de nome/veloMax,
    // que cada Carro tem o seu proprio valor guardado)
    private  static double veloLimite = 250;

    public Carro(String nome, double veloMax){
        this.nome = nome;
        this.veloMax = veloMax;
    }

    public void imprime(){
        System.out.println("-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.veloMax);
        System.out.println("Velocidade limite: " + Carro.veloLimite);
    }

    // get/set tambem static, porque atributo static só pode ser mudado por um metodo static -
    // chama-se pelo nome da classe (Carro.setVeloLimite(...)), não por um objeto (c1.setVeloLimite(...))
    // igual fizemos com getNome()/setNome() que são de instancia (sem static)
    public static void setVeloLimite(double veloLimite){
        Carro.veloLimite = veloLimite;
    }

    public static double getVeloLimite(){
        return Carro.veloLimite;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getveloMax(){
        return veloMax;
    }

    public void setVeloMax(double veloMax){
        this.veloMax = veloMax;
    }

}