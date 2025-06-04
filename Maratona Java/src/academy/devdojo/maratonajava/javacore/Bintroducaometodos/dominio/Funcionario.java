package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    double[] salario = {1200, 4000, 6000};
    double media = 0;

    public void imprime() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
    }

    public void exibirSalario(double[] salario) {
        for (double dinheiro : this.salario) {
            System.out.println("Salario: " + dinheiro);
        }
    }

    public void mediaSalario(double[] salario) {
        for (double valor : salario) {
            media += valor / salario.length;
        }
        System.out.println("Media: " + media);

    }
}
