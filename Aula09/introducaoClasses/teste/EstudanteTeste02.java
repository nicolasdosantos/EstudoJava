package Aula09.introducaoClasses.teste;

import Aula09.introducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Teste";
        System.out.println(estudante.nome);
    }

}
