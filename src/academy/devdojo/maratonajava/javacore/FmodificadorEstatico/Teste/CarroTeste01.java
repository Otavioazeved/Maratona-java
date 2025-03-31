package academy.devdojo.maratonajava.javacore.FmodificadorEstatico.Teste;

import academy.devdojo.maratonajava.javacore.FmodificadorEstatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("bmw", 280);
        Carro c2 = new Carro("mercedez", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
