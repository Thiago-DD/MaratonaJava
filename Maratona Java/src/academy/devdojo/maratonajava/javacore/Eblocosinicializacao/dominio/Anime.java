package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodeos;
    // 1 - alocado espaço em memoria pro objeto
    // 2 - cada atributo de classe é criado e inicializado com valores defoult ou o que for passada
    // 3 - Bloco de inicialização é executado
    // 4 - construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        for (int episodeos : this.episodeos) {
            System.out.print(episodeos + " ");
        }
        System.out.println();
    }



    public String getNome() {
        return nome;
    }

    public int[] getEpisodeos() {
        return episodeos;
    }
}
