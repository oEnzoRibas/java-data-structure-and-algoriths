package Etapa3.C12;

import java.util.Scanner;

    /*
    Preencher um vetor com os dados de outro vetor invetidos
    Autor: Enzo Rocha Leite Diniz Ribas
    */

public class C12EX19 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int qnt = 10;

    int vet1 [] = new int[qnt];
    int vet2 [] = new int[qnt];

    for (int i = 0; i < qnt; i++){
      System.out.println("Informe um número inteiro: ");
      vet1[i] = teclado.nextInt();
      teclado.nextLine();
    }
    for (int j = 0; j < qnt; j++){
      vet2[j] = vet1[(qnt-1)-j];
    }
    for (int k = 0; k < qnt; k++){
      System.out.print(" "+vet2[k]);
    }
  }
}
