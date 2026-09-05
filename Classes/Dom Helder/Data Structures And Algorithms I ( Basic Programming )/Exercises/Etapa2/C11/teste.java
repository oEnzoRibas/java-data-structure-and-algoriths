package Etapa2.C11;

public class teste {
    public static void main(String[] args) {

        double total;

        total = 1;
        int multiplicador = 1;


        // Restantes
        for (int casa = 2; casa <= 64; casa++) {

            if ((casa - 1) % 8 == 1) {
                multiplicador = 3; // Nas casas 9, 17, 25, 33, 41, 49 e 57
            } else {
                multiplicador = 2;
            }
            total *= multiplicador;
        }

        System.out.println(total);

    }
}