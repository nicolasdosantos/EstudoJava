package Aula09.Associacao.dominio;

public class Escola {
    private String nome;
    // mesmo padrão de associação "muitos" que Time/Jogador - uma Escola tem varios Professores
    private Professor[] professores;

        public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }

        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }
    


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}


