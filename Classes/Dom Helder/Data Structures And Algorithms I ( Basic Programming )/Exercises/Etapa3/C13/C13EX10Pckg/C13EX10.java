package Etapa3.C13.C13EX10Pckg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim().toUpperCase();

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
