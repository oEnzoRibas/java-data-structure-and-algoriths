package Etapa2.Prova_02;

import java.util.Scanner;

public class QuestãoB {
  public static void main(String[] args) {

/*

    Questão B da Segunda Prova de AEDI
    Autor: Enzo Rocha Leite Diniz Ribas

     */

    int rep;
    double serie = 0, den, num, vlr;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Infome a quantidade de termos: ");
    rep = teclado.nextInt();

    for (int aux = 1; aux <= rep; aux++){
      num = Math.sqrt(Math.pow(2,3*(aux-1))) + Math.pow(aux+1,aux-1);
      den = 2 * ( (aux*8)+7 );
      serie += ( num / den );

    }
    vlr = Math.pow(serie,4) + 543;
    System.out.println( vlr );
  }
}
