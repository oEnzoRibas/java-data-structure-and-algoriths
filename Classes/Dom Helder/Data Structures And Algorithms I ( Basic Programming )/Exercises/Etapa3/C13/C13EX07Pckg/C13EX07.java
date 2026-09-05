package Etapa3.C13.C13EX07Pckg;

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String nome, sobrenome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim();
        sobrenome = nome.substring(nome.lastIndexOf(" ")+1);
        System.out.println("O nome da sua família é "+sobrenome);
    }
}
