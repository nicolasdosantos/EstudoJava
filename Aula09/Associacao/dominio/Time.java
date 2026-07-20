package Aula09.Associacao.dominio;

public class Time {
    private String nome;
    // associação de "muitos" - um Time tem varios Jogadores, por isso é um array em vez de
    // uma referência unica (igual Jogador.time la em cima, que é "um" só)
    private Jogador jogadores[];

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador jogadores[]) {
        this.nome = nome;
        this.jogadores = jogadores;

    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) {
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
