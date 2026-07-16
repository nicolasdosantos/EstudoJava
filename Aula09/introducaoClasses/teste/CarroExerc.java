package Aula09.introducaoClasses.teste;

import Aula09.introducaoClasses.dominio.Carro;

public class CarroExerc {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca";
        carro.modelo = "Bolinha";
        carro.ano = 1950;

        carro2.nome = "Civic";
        carro2.modelo = "TypeR";
        carro2.ano = 2026;

        // carro = carro2; - Isso é uma referencia a partir daqui a 
        // variavel carro tem os mesmos atirbutos do que o carro2.

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano + "\n");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
