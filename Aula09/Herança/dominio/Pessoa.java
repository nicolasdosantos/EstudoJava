package Aula09.Herança.dominio;

public class Pessoa {
    // cuidado: mesmo Funcionario herdando de Pessoa, esses atributos protected continuam
    // invisiveis direto pra subclasse (funcionario.nome nao compilaria) - so da pra acessar
    // via get/set, que sao public e por isso sim sao herdados
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco static");
    }
    {
        System.out.println("Dentro do bloco de inicialização");
    }
    // agora que existe esse construtor com parametro, o construtor vazio implicito some -
    // isso obriga qualquer subclasse (Funcionario) a chamar super(nome) explicitamente
    public Pessoa(String nome){
        System.out.println("Dentro do contrutor pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

}
