package academy.devdojo.maratonajava.javacore.Deconstrutores.dominio;

import academy.devdojo.maratonajava.javacore.sobrecargademetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Pikachu", "Mangá", 12);
        anime.setGenero("Desenho");
        anime.init("Pikachu", "Mangá", 12, "4k");
         anime.imprime();

    }
}
