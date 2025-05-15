package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {

        // Imprima todos os numeros pares de 0 até 1000000

        int count = 0;

        /*for (count = 0; count <= 1000000; ++count) {
            System.out.println(count);
            count = ++count;
        }*/

        for (int i = 0; i <= 1000000 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }
}
