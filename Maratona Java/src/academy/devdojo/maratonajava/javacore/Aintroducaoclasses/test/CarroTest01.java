package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Tesla";
        carro.modelo = "Carro eletrico";
        carro.ano = 2008;

        carro2.nome = "BYD";
        carro2.modelo = "Carro eletrico";
        carro2.ano = 2025;

        System.out.println("Modelo: " + carro.modelo + " Nome: " + carro.nome + " Ano: " + carro.ano);
        System.out.println("Modelo: " + carro2.modelo + " Nome: " + carro2.nome + " Ano: " + carro2.ano);

    }
}
