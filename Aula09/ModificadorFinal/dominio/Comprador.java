package Aula09.ModificadorFinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Comprador{ " + "nome=''" + nome + '\''+'}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
