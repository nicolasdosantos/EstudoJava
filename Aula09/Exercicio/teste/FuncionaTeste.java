package Aula09.Exercicio.teste;
import Aula09.Exercicio.dominio.Funcionario;

public class FuncionaTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // agora os atributos são private, então só dá pra acessar via get/set
        funcionario.setNome("Nicolas");
        funcionario.setIdade(19);
        funcionario.setSalario(new double[]{1500,2000,2500});

        // chama os metodos da propria classe Funcionario, sem precisar passar nada por parametro
        // porque eles usam os atributos do objeto direto (nome, idade, salario)
        funcionario.imprime();
        funcionario.media();
    }
}
