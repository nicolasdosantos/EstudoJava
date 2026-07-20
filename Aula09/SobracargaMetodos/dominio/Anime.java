package Aula09.SobracargaMetodos.dominio;

public class Anime {
    // atributos private de novo (já vinha fazendo assim desde Pessoa/Funcionario) - acesso só via get/set
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    // sobrecarga (overloading) - mesmo nome "init", mas assinaturas diferentes (quantidade/tipo de parametro)
    // o Java decide qual versao chamar olhando os argumentos passados, isso é resolvido em tempo de compilação
    public void init( String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // essa versao com genero reaproveita a de 3 parametros (evita repetir nome/tipo/episodios de novo)
    public void init( String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
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
