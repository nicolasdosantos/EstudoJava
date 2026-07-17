package Aula09.introducaoClasses.teste;

import Aula09.introducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        // cria o objeto (instância) da classe Estudante
        Estudante estudante = new Estudante();
        // como os atributos são public, dá pra acessar e preencher direto pelo objeto
        estudante.nome = "Nicolas";
        estudante.idade = 19;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
