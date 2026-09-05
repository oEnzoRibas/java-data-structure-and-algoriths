package Etapa3.C12;

import java.util.Scanner;

public class C12EX03 {
  public static void main(String[] args) {

    /*
        Preencher vetor e elevar valores ao quadrado
        Autor: Enzo Rocha Leite Diniz Ribas
         */


    int[] vet = new int[10];

    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < vet.length; i++) {

      System.out.println("Informe um número inteiro: ");
      vet[i] = teclado.nextInt();

    }

    for (int i : vet) {

      System.out.println(Math.pow(i,2));

    }
  }
}