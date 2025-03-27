package academy.devdojo.maratonajava.javacore.Deconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String formato;



// construtores

    public Anime(String nome){
        System.out.println("dentro do construtor");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);

        System.out.println(this.formato);
    }

    public void setGenero(String genero){
        this.genero =  genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void init (String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init (String nome, String tipo, int episodios, String formato){
        this.formato = formato;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
       return this.tipo;

    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }

}
