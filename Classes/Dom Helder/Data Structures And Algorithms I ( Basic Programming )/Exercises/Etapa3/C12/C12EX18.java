package Etapa3.C12;

import java.util.Scanner;

public class C12EX18 {
  public static void main(String[] args) {

    /*
    Multiplicar valores de um vetor por um número real
    Autor: Enzo Rocha Leite Diniz Ribas
    */

    Scanner teclado = new Scanner(System.in);

    double[] num = new double[10];
    double numeroR;

    // preenchimento do vetor
    for (int i = 0; i < num.length; i++) {
      System.out.println("Informe um n�mero inteiro: ");
      num[i] = teclado.nextInt();
    }

    System.out.println("Informe um n�mero real para ser o multiplicador: ");
    numeroR = teclado.nextDouble();

    for(int k = 0; k < num.length; k++){
      num[k] *= numeroR;
      System.out.println(num[k]);
    }
  }
}
