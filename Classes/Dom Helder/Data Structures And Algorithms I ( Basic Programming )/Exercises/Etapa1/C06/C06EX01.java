package Etapa1.C06;

import java.util.Scanner;

// Calcular O valor de X nas funções
// Autor Enzo Rocha Leite Diniz Ribas

public class C06EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe valor de x: ");
        double y, x = teclado.nextDouble();
        if (x < 4) {
            y = ((5 * x) + 3) / (Math.sqrt(16 - (Math.pow(x,2))));
            System.out.println(y);
        } else if (x == 4) {
            y = 0;
            System.out.println(y);
        } else if (x > 4) {
            y = ((5 * x) + 3) / (Math.sqrt(Math.pow(x,2) - 16));
            System.out.println(y);
        }
        }
    }
