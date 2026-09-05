package Etapa1.C06;

import java.util.Scanner;

public class C06EX07 {
    public static void main(String[] args) {

        // Calcular PL líquido
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        double salario, plLiq, plBru, impostoDeRenda;

        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();

        if (salario <= 300) {
            plBru = 500 + (salario * 0.7);
            impostoDeRenda = plBru * 0.25;
            plLiq = plBru - impostoDeRenda;
            System.out.println("PL Líquido de: "+plLiq);
        } else if (salario > 300 && salario <= 1000) {
                plBru = 200 + (salario * 0.5);
                impostoDeRenda = plBru * 0.25;
                plLiq = plBru - impostoDeRenda;
                System.out.println("PL Líquido de: "+plLiq);
                } else if (salario > 1000) {
                    plBru = (salario * 0.3);
                    impostoDeRenda = plBru * 0.25;
                    plLiq = plBru - impostoDeRenda;
                    System.out.println("PL Líquido de: "+plLiq);
        }
    }
}