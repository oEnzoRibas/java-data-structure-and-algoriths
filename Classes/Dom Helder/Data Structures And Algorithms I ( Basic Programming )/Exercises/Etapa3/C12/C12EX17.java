package Etapa3.C12;

import java.util.Scanner;

public class C12EX17 {
  public static void main(String[] args) {

    /*
    Imprimir os números pares dentro de um vetor
    Autor: Enzo Rocha Leite Diniz Ribas
    */

    Scanner teclado = new Scanner(System.in);

    int[] num = new int[10];
    double media, soma = 0;
    int contPares = 0;

    // preenchimento do vetor
    for (int i = 0; i < num.length; i++) {
      System.out.println("Informe um número inteiro: ");
      num[i] = teclado.nextInt();
    }

    System.out.println("Números pares: ");
    for (int i : num) {
      if (i % 2 == 0) {
        System.out.println(i);
        contPares++;
        soma += i;
      }
    }
    if (contPares == 0) {
      System.out.println("Não foi encontrado nenhum número par!");
    }
      media = soma / contPares;
      System.out.printf("Média dos números informados = %.2f", media);
    }
  }
