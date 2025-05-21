package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas ele pode ser parcelado
        // condição ValorParcela >= 1000

        double valorCarro = 30000;

        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela+ " de "+ valorParcela);
        }
    }
}
