package Etapa1.C05;

import java.util.Scanner;

import static java.lang.Integer.valueOf;
// Calcular Resultado da Função X^3 + 4X +10
// Autor: Enzo Rocha Leite Diniz Ribas
public class C05EX01 {
    public static void main(String[] args) {
        String xStr;
        double funcao;
        int xInt;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o Valor de X: ");
        xStr = teclado.nextLine();
        xInt = Integer.valueOf(xStr);
        funcao = (Math.pow (xInt,3) + 4*xInt + 10 );
        System.out.println("Resultado: "+funcao);
    }
}
