package Aula09.BlocosInicializacao.teste;

import Aula09.BlocosInicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Teste");

        for(int i = 0; i < anime.getEposidios().length; i++){
            System.out.println(anime.getEposidios()[i]);
        }
    }
}
