package academy.devdojo.maratonajava.introdução;

public class aula04Aritimeticos {
    // aula 04 operadores + - / *
    public static void main(String[] args) {
        int numero01 = 10;
        double numero02 = 20;
       double resultad = numero01 / numero02;

        System.out.println(resultad);
        System.out.println( " a multipicação : " + (numero02 * numero01));

        // %
        int resto = 20 % 2;
        System.out.println( " o resto desa divisão é: " +resto);

        // < >  <= >=  == != operadores lógicos sempre retornam valores boleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println( " esta afirmação é " + isDezMaiorQueVinte);

        boolean isCincoMaiorQueDois = 5 > 2;
        System.out.println(isCincoMaiorQueDois);

        boolean isCincoIgualSeis = 5 == 6;
        System.out.println(isCincoIgualSeis);

        boolean isCincoDiferenteDeNove = 5 != 9;
        System.out.println(isCincoDiferenteDeNove);
        int som01 = 12;
        int som02 = 6;
        System.out.println( " A divisão de 12 por 6 é: " + (som01 / som02));

        // operadores lógicos - && (AND),  || (esse é o ou), negação (!) not, result tras um boolean
        int age = 22;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario >= 4612;
         boolean isDentroDaLeiMenorQueTrinta = age < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " +  isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        int agee = 19;
        String military = "posso servir";
        String check = "não possos servir";
        boolean isTenhoIdade = agee > 18;
        boolean isNaoTemIdade = agee < 18;
        System.out.println(  " tenho idade para servir " +isTenhoIdade);
        System.out.println("tenho idade para servir " +  isNaoTemIdade );

        double valorConta = 12000;
        double valorNubank = 15000;
        float valorCarro = 13000;

        boolean isTemDinheiroPraComprarCarro = valorConta > valorCarro || valorNubank >= valorCarro;

        System.out.println("isTemDinheiroPraComprarCarro" + isTemDinheiroPraComprarCarro );

        double bonus = 2800;
        bonus /= 2;
        System.out.println(bonus);

        int contador = 0;
        contador++;
        System.out.println(contador);











    }
}
