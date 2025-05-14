package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // de 0 > 34712 paga 9.70%
        // de 34713 > 68507 paga 37.35%
        // 68508 pra cima paga 49.50%

        double salario = 70000;
        double taxa01 =  9.70 / 100;
        double taxa02 =  37.35 / 100;
        double taxa03 =  49.50 / 100;
        double salarioFinal;

        if (salario <= 34712) {
            salarioFinal = salario * taxa01;
        }else if (salario >= 34713 && salario <= 68507) {
            salarioFinal = salario * taxa02;

        }else {
            salarioFinal = salario * taxa03;
        }

        System.out.println(salarioFinal);
    }
}
