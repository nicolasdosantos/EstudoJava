package Aula09.ConstrutoresMetodos.testes;

import Aula09.ConstrutoresMetodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Teste", "manga", 10, "Ação", "TEste");

        anime.imprime();

    }
}
