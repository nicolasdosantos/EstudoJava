import Aula09.IntroducaoMetodo.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nicolas");
        pessoa.setIdade(8);
        // pessoa.imprime();
        // usando os gets pra montar a impressão do meu jeito, em vez do formato fixo do imprime()
        System.out.println(pessoa.getNome() + " " + pessoa.getIdade());

    }
}
