package Etapa2.C08;

public class C08EX24 {
    public static void main(String[] args) {

        // Imprimir a série com o mathpow feito por um for
        // Autor: Enzo Rocha Leite Diniz Ribas

        double somapot = 0, pot;

        for (int i = 1; i <= 99; i+=2){
            pot = 1;

                for (int k = 1; k <= i; k++) {  //LAÇO DE REPETIÇÃO QUE SUBSTITUI UMA MATH.POW PARA ELEVER 2 N VEZES
                        pot *= 2;
                }

            somapot += pot;
        }

        double serie = ((double) 1 / 3 )*(somapot);
        System.out.println(serie);
    }
}
