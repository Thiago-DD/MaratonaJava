package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "jorge";
        funcionario.idade = 38;
        double[] salario = {1200, 4000, 6000};

        funcionario.imprime();
        funcionario.exibirSalario(salario);
        funcionario.mediaSalario(salario);
    }
}