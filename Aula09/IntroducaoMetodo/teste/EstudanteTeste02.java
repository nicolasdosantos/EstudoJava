import Aula09.IntroducaoMetodo.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Antonio";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 14;
        estudante2.sexo = 'S';

        // diferente do EstudanteTeste, aqui o imprime() é um metodo da propria classe Estudante
        // (não precisa de uma classe separada tipo ImprimeEstudante pra imprimir os dados)
        estudante1.imprime();
        estudante2.imprime();

    }
}
