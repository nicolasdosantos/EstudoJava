package Aula09.introducaoClasses.teste;

import Aula09.introducaoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        // cria o objeto e preenche os atributos direto (são public)
        Professor professor = new Professor();
        professor.nome = "João";
        professor.idade = 15;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
