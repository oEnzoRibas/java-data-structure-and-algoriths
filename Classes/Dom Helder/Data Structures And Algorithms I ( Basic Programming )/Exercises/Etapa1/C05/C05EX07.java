package Etapa1.C05;

import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args) {
        // Calcular Função
        // Autor: Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        double x = teclado.nextDouble(), funcao = (Math.pow((Math.pow(((x/4) + 1),2) + (((double) 1/5) * x)),1.0 / 2));
        System.out.println("Quando X = "+x+"\nResultado da Função = "+funcao);
    }
}
