package Aula09.SobracargaMetodos.testes;

import Aula09.SobracargaMetodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        // chamando com 4 argumentos o Java escolhe a sobrecarga de init(nome, tipo, episodios, genero)
        anime.init("Teste", "manga", 10, "Ação");

        anime.imprime();

    }
}
