package Aula09.IntroducaoMetodo.dominio;

public class ImprimeEstudante {
    // metodo recebe um objeto Estudante como parametro e imprime os atributos dele
    public void imprime(Estudante estudante){
        System.out.println("---------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
