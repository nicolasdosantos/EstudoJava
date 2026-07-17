package Aula09.introducaoClasses.teste;

import Aula09.introducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        // cria outro objeto, independente do que foi criado no EstudanteTeste01
        Estudante estudante = new Estudante();
        estudante.nome = "Teste";
        System.out.println(estudante.nome);
    }

}
