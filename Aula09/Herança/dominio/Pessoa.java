package Aula09.Herança.dominio;

public class Pessoa {
    // cuidado: mesmo Funcionario herdando de Pessoa, esses atributos private continuam
    // invisiveis direto pra subclasse (funcionario.nome nao compilaria) - so da pra acessar
    // via get/set, que sao public e por isso sim sao herdados
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime(){
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
