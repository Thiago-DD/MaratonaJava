package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 * numero01;
        System.out.println(resultado);

        // %
        int resto = 60 % 3;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) !
        int idade = 21;
        float salario = 2560F;
        boolean isDentroDaLei = idade >= 30 && salario > 4000;
        boolean isNaoDentroDaLei = idade <= 30 && salario > 2000;

        System.out.println("isDentroDaLei "+isDentroDaLei);
        System.out.println("isNaoDentroDaLei "+isNaoDentroDaLei);

        double valorContaCorrente = 250;
        double valorContaPoupanca = 8000;
        float valorPc = 7000;
        boolean isPcCompravel = valorContaCorrente >= valorPc || valorContaPoupanca >= valorPc;

        System.out.println("isPcCompravel "+isPcCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 300;
        bonus /= 3;
        System.out.println(bonus);
    }
}
