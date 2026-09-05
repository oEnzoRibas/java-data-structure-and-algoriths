package Etapa3.C12;

import java.util.Scanner;

public class C12EX02 {
  public static void main(String[] args) {

/*
        Procurar valores entre 5 e 10 em um vetor
        Autor: Enzo Rocha Leite Diniz Ribas
         */

    int[] vet = new int[10];

    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < vet.length; i++) {

      System.out.println("Informe um número inteiro: ");
      vet[i] = teclado.nextInt();

    }

  for (int j = 0; j < vet.length; j++){

      if (vet[j] > 5 && vet[j] < 10 ){

        System.out.println(vet[j]);

        }

    }
  }
  }
