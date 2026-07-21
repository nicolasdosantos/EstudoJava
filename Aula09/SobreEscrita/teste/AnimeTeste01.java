package Aula09.SobreEscrita.teste;

import Aula09.SobreEscrita.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");

        // aqui o println chama o toString() do objeto por baixo dos panos -
        // como Anime sobrescreveu esse metodo, sai "Anime: Dr. Stone" em vez do
        // endereco de memoria/hash que viria do toString() padrao de Object
        System.out.println(anime);

        
    }
}
