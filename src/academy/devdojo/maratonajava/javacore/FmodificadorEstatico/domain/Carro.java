package academy.devdojo.maratonajava.javacore.FmodificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
   private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidadeMaxima " + this.velocidadeMaxima);
        System.out.println("velocidadelimite " + this.velocidadeLimite);
    }
    public static void setvelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getvelocidadeLimite(){
        return Carro.velocidadeLimite;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;

    }
    public double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    public void setVelocidadeLimite(double velocidadeLimite){
        this.velocidadeMaxima = velocidadeMaxima;
    }

}

