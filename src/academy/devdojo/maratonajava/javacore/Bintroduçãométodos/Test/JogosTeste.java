package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Jogos;

public class JogosTeste {
    public static void main(String[] args) {
        Jogos jogos = new Jogos();
        jogos.setJogo("flamengo x vasco");
        jogos.setAno(2024);
        jogos.setPlacar(61);
        jogos.imprime();
        System.out.println(jogos.getJogo());
        System.out.println(jogos.getAno());
        System.out.println(jogos.getPlacar());

    }
}
