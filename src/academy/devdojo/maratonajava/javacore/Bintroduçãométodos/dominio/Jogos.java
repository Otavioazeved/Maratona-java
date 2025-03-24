package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio;

public class Jogos {
    private String jogo;
    private int ano;
    private int placar;

    public void imprime(){
        System.out.println(this.jogo);
        System.out.println(this.ano);
        System.out.println(this.placar);
    }
    public void setJogo(String jogo){
        this.jogo = jogo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setPlacar(int placar){
        this.placar = placar;

    }
    public String getJogo(){
        return this.jogo;
    }
    public int getAno(){
        return this.ano;
    }
    public int getPlacar(){
        return this.placar;
    }
}



