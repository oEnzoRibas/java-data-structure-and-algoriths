package Etapa3.C13.C13EX09Pckg;

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma frase: ");

        String [] wordVet = teclado.nextLine().split(" ");

        StringBuilder newFrase = new StringBuilder();

        // itera para cada palavra no vetor
        for (String word : wordVet)  {

            // substitui a primeira letra por ela mesma Maiúscula e mantem o resto da string inalterada
            String letraCAPS = word.substring(0,1).toUpperCase() + word.substring(1);

            newFrase.append(letraCAPS).append(" ");
        }
        String fraseFormat = newFrase.toString().trim();

        System.out.println(newFrase);
    }
}
