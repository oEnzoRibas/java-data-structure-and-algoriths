package Etapa2.C08;

public class C08EX27 {
    public static void main(String[] args) {

        // Imprimir desenho ASCII
        // Autor: Enzo Rocha Leite Diniz Ribas

        int rep;

        for (int k = 1; k <= 10; k++){


            for (int j = 0; j <= 9; j++) {

                rep = (int) Math.pow(2,j);

                for (int i = 1; i <= rep; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int j = 9; j >= 0; j--) {

                rep = (int) Math.pow(2,j);

                for (int i = 1; i <= rep; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }

    }

}
