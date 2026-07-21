package Aula09.Herança.teste;

import Aula09.Herança.dominio.Funcionario;
import Aula09.Herança.dominio.Endereco;
import Aula09.Herança.dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyhisa Shimazu");

        pessoa.setCpf("12121212");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario( "Nicolas ");

        // setNome, setCpf, setEndereco e imprime() nao existem escritos em Funcionario.java -
        // sao herdados de Pessoa. So setSalario() e proprio da classe Funcionario
        funcionario.setCpf("1111111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        // funcionario.imprime() chama a versao sobrescrita em Funcionario (nao a de Pessoa) -
        // e o polimorfismo em acao: o Java sempre executa o metodo mais especifico do objeto real
        funcionario.imprime();
        funcionario.relatorio();

    }
}
