package Aula09.ModificadoresEstatico.dominio;

public class Anime {
    private String nome;
    // static aqui também - só existe UM array episodios pra classe toda, não um por Anime criado
    // (diferente da versao de BlocosInicializacao, onde cada objeto tinha o seu proprio array)
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando o JVM carregar as classes
    // 1 - Alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for para 
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    // esse aqui é "static{}" (bloco de inicializacao ESTATICO), nao instancia - roda so UMA vez,
    // quando a classe é carregada pela JVM (bate com o passo 3 do resumo aqui em cima), mesmo que
    // eu crie 10 objetos Anime depois. É diferente do bloco de BlocosInicializacao, que roda de novo
    // a cada "new" - por isso o comentario original (feito pra aquele outro arquivo) falava em instancia
    static{
        episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println(episodios[i]);
        }
    }

    // esse construtor roda DEPOIS do bloco acima - por isso quando "new Anime(...)" e chamado,
    // primeiro imprime os 100 episodios pra depois so então setar o nome
    // mas isso só acontece no PRIMEIRO "new Anime(...)" do programa - da segunda vez em diante o
    // static{} nao roda de novo (a classe ja foi carregada), só o construtor mesmo
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
