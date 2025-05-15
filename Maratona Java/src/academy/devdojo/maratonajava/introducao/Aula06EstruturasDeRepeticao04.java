package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas ele pode ser parcelado
        // condição ValorParcela >= 1000

        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro ; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
               break;
            }
            System.out.println(parcela+ " de "+ valorParcela);
        }
    }
}
