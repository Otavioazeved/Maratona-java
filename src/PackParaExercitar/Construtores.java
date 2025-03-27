package PackParaExercitar;

public class Construtores {
    // Atributos
    String nome;
    String marca;
    float valor;


    // construtor
    Construtores (){

    }
    Construtores(String nome){
        this.nome = nome;

    }
    Construtores(String nome, String marca){
        this.nome = nome;
        this.marca = marca;

    }
    Construtores(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;

    }

}


