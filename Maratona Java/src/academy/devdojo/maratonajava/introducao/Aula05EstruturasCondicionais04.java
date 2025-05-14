package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // de 0 > 34712 paga 9.70%
        // de 34713 > 68507 paga 37.35%
        // 68508 pra cima paga 49.50%

        double salario = 25000;
        double taxa01 =  9.70 / 100;
        double taxa02 =  37.35 / 100;
        double taxa03 =  49.50 / 100;
        double valorImposto;
        double salarioFinal;

        if (salario <= 34712) {
            valorImposto = salario * taxa01;
            salarioFinal = salario - valorImposto;
        }else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * taxa02;
            salarioFinal = salario - valorImposto;
        }else {
            valorImposto = salario * taxa03;
            salarioFinal = salario - valorImposto;
        }

        System.out.println(salarioFinal);
    }
}
