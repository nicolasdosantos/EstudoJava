import Aula09.IntroducaoMetodo.dominio.Estudante;
import Aula09.IntroducaoMetodo.dominio.ImprimeEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante1.nome = "Antonio";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 14;
        estudante2.sexo = 'S';

        // aqui é objeto, então o metodo recebe a referencia do estudante
        // (diferente do que acontece com tipo primitivo, que recebe só uma copia)
        imprime.imprime(estudante1);
        imprime.imprime(estudante2);

    }
}
