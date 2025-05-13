package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoBeber = idade >= 18;
        //!

        if (isAutorizadoBeber) {
            System.out.println("pode beber");
        }
        System.out.println("ninguem bebe");

        if (!isAutorizadoBeber){
            System.out.println("não pode beber");
        }
    }
}

