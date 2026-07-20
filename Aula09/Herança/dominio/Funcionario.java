package Aula09.Herança.dominio;

// herança - "extends" faz Funcionario herdar tudo que Pessoa tem (nome, cpf, endereco, imprime())
// sem precisar reescrever nada. É a relação "é um": Funcionario É UMA Pessoa, só que com um
// atributo a mais (salario). Diferente de associação (Aula09/Associacao), onde uma classe só
// TEM uma referência pra outra - aqui a classe filha vira um "tipo" da classe pai
public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}


