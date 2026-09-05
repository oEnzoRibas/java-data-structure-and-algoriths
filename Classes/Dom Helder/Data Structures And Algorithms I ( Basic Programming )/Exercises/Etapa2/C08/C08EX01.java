package Etapa2.C08;

import java.util.Scanner;
// Calcular Área Do Circulo
// Autor: Enzo Rocha Leite Diniz Ribas
public class C08EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDigite o Raio do Círculo: ");
            String raioStr = teclado.nextLine();
            int raioInt = Integer.valueOf(raioStr);
            double area = (Math.PI * (Math.pow(raioInt,2)));
            System.out.printf("\nA area do círculo e %.3f\n",area);
        }
    }
}
