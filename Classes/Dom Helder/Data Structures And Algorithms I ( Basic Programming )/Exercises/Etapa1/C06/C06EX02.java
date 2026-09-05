package Etapa1.C06;

import java.util.Scanner;

public class C06EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nível de poluentes: ");
        double nlPol = teclado.nextDouble();
        if (nlPol <= 1500){
            System.out.println("Isento de multa");
        } else if (nlPol > 1500 && nlPol <= 3500) {
            System.out.println("Multa de R$3.000,00");
        } else {
            double multaNv3 = 5000*nlPol;

            String multaNv3Format = String.format("%.3f", multaNv3);

            System.out.println("Multa de R$"+multaNv3Format);
            }
        };
    }
