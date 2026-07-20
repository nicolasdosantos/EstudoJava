package Aula09.Associacao.dominio;

public class Jogador {
    private String nome;
    // associação: Jogador tem uma referência pra Time, é assim que uma classe "conhece" a outra
    // em Java - não tem "join" automatico como em banco, o objeto guarda a referência direto
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        // time pode ser null (jogador sem time ainda) - por isso o check antes de usar,
        // senão daria NullPointerException ao chamar time.getNome()
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
