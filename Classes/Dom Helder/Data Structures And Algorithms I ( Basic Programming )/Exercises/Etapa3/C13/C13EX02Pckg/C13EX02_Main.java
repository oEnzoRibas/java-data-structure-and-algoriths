package Etapa3.C13.C13EX02Pckg;

import java.util.Scanner;

public class C13EX02_Main {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        double x;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para finalizar digite '-1'\nInforme um valor de X:");
        x = teclado.nextDouble();

        do {

            System.out.println(C13EX02Funcao.funcao(x));

            System.out.println("Para finalizar digite '-1'\nInforme um valor de X:");
            x = teclado.nextDouble();
        }while(x != -1);
        System.out.println("Programa finalizado!");


    }
}
