package Etapa2.Prova_02;

import java.util.Scanner;

public class QuestãoA {
  public static void main(String[] args) {

    /*

    Questão A da Segunda Prova de AEDI
    Autor: Enzo Rocha Leite Diniz Ribas

     */

    double somaGraos = 1, graos = 1;
    int a = 0;
    for (int i = 2; i <= 64; i++){

      if (i == 9 || i == 17 || i == 25 || i == 33 || i == 41 || i == 49 || i == 57){
        graos *= 3;
        somaGraos += graos;
      } else {
        graos *= 2;
        somaGraos += graos;
      }
      System.out.println(i + " " + graos);
    }
    System.out.println("Total de Grãos:"+somaGraos);
  }
}
