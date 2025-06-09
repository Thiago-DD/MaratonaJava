package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String categoria;
    private String estudio;

    // Construtores
    public Anime(String nome, String tipo, int episodeos, String categoria) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.categoria = categoria;
    }

    // Sobrecarga de construtores
    public Anime(String nome, String tipo, int episodeos, String categoria, String estudio) {
        this(nome, tipo, episodeos, categoria);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodeos);
        System.out.println(categoria);
        System.out.println(estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

