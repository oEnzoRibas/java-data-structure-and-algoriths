package Etapa2.C08;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {

        // Calcular serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        double serie, n, x, subSerie = 0;

        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        System.out.println("Informe o valor de n: ");
        n = teclado.nextDouble();

        for (int i = 1; i <= n; i++){
            subSerie += ( Math.pow(x,i) / i);
        }

        serie = Math.log(x)+(subSerie);
        System.out.println(serie);
        
    }
}
