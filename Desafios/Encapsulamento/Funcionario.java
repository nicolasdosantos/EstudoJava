package Desafios.Encapsulamento;

// atributos private - encapsulamento. Só dá pra mexer em nome/salario através dos métodos
// get/set daqui de baixo, nunca direto de fora da classe (tipo funcionario.salario = -100)
public class Funcionario {
    private String nome;
    private double salario = 0;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // essa validação dentro do set é o ganho real do encapsulamento - com atributo public
    // qualquer código externo poderia jogar um salario negativo direto, sem passar por nenhuma regra
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario invalido! ");

        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
