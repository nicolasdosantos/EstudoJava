package Aula09.Associacao.Exercicio.dominio;

public class Professor {
    private String nome;
    private String espe;
    private Seminario seminario[];

    public Professor(String nome, String espe) {
        this.nome = nome;
        this.espe = espe;
    }

    public Professor(String nome, String espe, Seminario seminario[]) {
        this.nome = nome;
        this.espe = espe;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("-------");
        System.out.println("Professor: " + this.nome);
        if (seminario == null) {
            return;
        }

        for (Seminario seminario2 : seminario) {
            System.out.println("Seminarios Disponiveis: ");
            System.out.println("Seminario: " + seminario2.getTitulo());
            // encadeando get's pra atravessar as associações: de Professor chega em Seminario,
            // e de Seminario chega em Local - só funciona pq cada get retorna o objeto certo.
            // se local fosse null aqui, ia dar NullPointerException nesse getEndereco()
            System.out.println("Local: " + seminario2.getLocal().getEndereco());
            System.out.println("--- Alunos ---");
            for (Aluno alunos : seminario2.getAluno()) {
                System.out.println(alunos.getNome());
                System.out.println(alunos.getIdade());
            }
        }

    }

    public void setSeminario(Seminario seminario[]) {
        this.seminario = seminario;
    }

    public Seminario[] getSeminario() {
        return this.seminario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }

    public String getEspe() {
        return this.espe;
    }

}
