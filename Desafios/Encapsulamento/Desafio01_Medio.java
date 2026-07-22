package Desafios.Encapsulamento;

/*
 * DESAFIO 01 — 🟡 Médio — Encapsulamento
 * Cenário: RH — Cadastro de Funcionário
 *
 * Crie Funcionario com nome e salario private. setSalario só atualiza
 * se o valor for maior que zero (senão imprime erro e mantém o
 * anterior); getSalario/getNome/setNome simples. No main, teste um
 * salário negativo e depois um válido. Sem try-catch, só if.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Nicolas");
        funcionario.setSalario(-100.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());

        funcionario.setSalario(100.00);

        funcionario.imprime();
        

    }
}
