package PackParaExercitar;

public class ConstrutorTeste {
    public static void main(String[] args) {
        // construtor padrão:
        Construtores p1 = new Construtores();
        p1.nome = "caneta preta";
        p1.marca = "bic";
        p1.valor = 1.50f;

        // construtor de dois parametros

        Construtores p2 = new Construtores("caneta vermelha", "faber");

        // construtor de 3 parametros

        Construtores p3 = new Construtores("borracha", "mercur",1.89f);
        System.out.println(p1.nome);
        System.out.println(p1.marca);
        System.out.println(p1.valor);
    }
}
