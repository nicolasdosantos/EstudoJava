package Aula09.ConstrutoresMetodos.dominio;

public class Anime {
    // atributos private de novo (já vinha fazendo assim desde Pessoa/Funcionario) -
    // acesso só via get/set
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    // construtor - metodo especial chamado pelo "new", sem tipo de retorno e com o mesmo nome da classe
    // cuidado: assim que a classe tem QUALQUER construtor proprio, o Java deixa de gerar o construtor
    // vazio padrao (Anime()) de graca - por isso o "new Anime()" sem argumentos deixaria de funcionar
    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // sobrecarga de construtor, igual fizemos com os metodos init em SobracargaMetodos
    // "this(...)" chama outro construtor da propria classe (precisa ser a primeira linha do bloco),
    // assim reaproveita o construtor de 4 parametros em vez de repetir as mesmas atribuicoes
    public Anime(String nome, String tipo, int episodios, String genero ,String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }



    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEposidios() {
        return this.episodios;
    }
}
