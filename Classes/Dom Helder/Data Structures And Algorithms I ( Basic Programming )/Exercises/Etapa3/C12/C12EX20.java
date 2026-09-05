package Etapa3.C12;

import java.util.Scanner;

public class C12EX20 {
  public static void main(String[] args) {

    /*
    Imprimir todos os numeros de um vetor que sao
    maiores que o ultimo numero
    Autor: Enzo Rocha Leite Diniz Ribas
    */

    Scanner teclado = new Scanner(System.in);

    double[] num = new double[10];

    // preenchimento do vetor
    for (int i = 0; i < num.length; i++) {
      System.out.println("Informe um n?mero : ");
      num[i] = teclado.nextInt();
    }

    for (double v : num) {
      if (v > num[num.length - 1]) {


        System.out.println(v);
      }
    }
  }
}
