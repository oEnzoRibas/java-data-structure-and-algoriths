package Etapa3.C12;

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        String frase;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma frase: ");
        frase = teclado.nextLine();

        String [] vetFrase = frase.split(" ");

        for (int i = 0; i < vetFrase.length; i++){
            System.out.println(vetFrase[i]);
        }



    }
}
