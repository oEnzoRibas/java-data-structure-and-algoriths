package Etapa1.C04;

import java.util.Scanner;
// Calcular nível de poluentes
// Autor: Enzo Rocha Leite Diniz Ribas
public class C04EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nvPol1, multa1, nvPol2, multa2, nvPol3, multa3;
        System.out.print("Digite o primeiro nivel de poluentes: ");
        nvPol1 = teclado.nextDouble();
        System.out.print("Digite o valor da multa do primeiro nivel de poluentes: ");
        multa1 = teclado.nextDouble();
        System.out.print("Digite o segundo nivel de poluentes: ");
        nvPol2 = teclado.nextDouble();
        System.out.print("Digite o valor da multa do segundo nivel de poluentes: ");
        multa2 = teclado.nextDouble();
        System.out.print("Digite o terceiro nivel de poluentes: ");
        nvPol3 = teclado.nextDouble();
        System.out.print("Digite o valor da multa do terceiro nivel de poluentes: ");
        multa3 = teclado.nextDouble();
        System.out.println();
        System.out.println("\t\tQuantidade de Poluentes Emitidos X Valor da Multa\n\n");
        System.out.printf("\t\tAté %s - multa de R$ %s\n", nvPol1,multa1);
        System.out.printf("\t\tEntre %s e %s - multa de R$ %s\n", nvPol1,nvPol2,multa2);
        System.out.printf("\t\tAcima de %s - multa de R$ %s", nvPol3,multa3);
        teclado.close();
    }
}
