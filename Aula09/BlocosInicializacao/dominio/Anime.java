package Aula09.BlocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // bloco de inicializacao de instancia - roda toda vez que um objeto e criado, antes do corpo do
    // construtor (independente de qual construtor for chamado, se a classe tivesse mais de um)
    // serve pra inicializar atributo com uma logica mais complexa do que só "= valor" direto na declaracao
    {
        episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println(episodios[i]);
        }
    }

    // esse construtor roda DEPOIS do bloco acima - por isso quando "new Anime(...)" e chamado,
    // primeiro imprime os 100 episodios pra depois so então setar o nome
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    // getEposidios - mesmo typo que já apareceu antes (deveria ser getEpisodios), Java nao valida
    // nome de metodo entao compila normal, só fica mais dificil de lembrar o nome certo depois
    public int[] getEposidios() {
        return episodios;
    }

}
