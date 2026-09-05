package Etapa2.C08;

import java.util.Scanner;

public class C08EX29 {
    public static void main(String[] args) {

        // Calcular x elevado a y
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        double res, x, y, z = 0;

        System.out.println("Informe o valor de X: ");
        x = teclado.nextDouble();

        System.out.println("Informe o valor de Y: ");
        y = teclado.nextDouble();

        res = 1;

        for (int k = 1; k <= Math.abs(y); k++) {  //LAÇO DE REPETIÇÃO QUE SUBSTITUI UMA MATH.POW PARA ELEVER 2 N VEZES
            if ( y < 0){
                res /= x;
            } else {
            res *= x;
            }
        }

        System.out.println(res);
    }

    }
