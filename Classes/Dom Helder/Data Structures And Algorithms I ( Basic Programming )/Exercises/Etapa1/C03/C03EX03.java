package Etapa1.C03;

import java.util.Scanner;
public class C03EX03 {
  // Função: Calcula Hipotenusa
// Autor: Enzo Rocha Leite Diniz Ribas
   public static void main(String[] args) {
     double hipotenusa, cateto1, cateto2;
     Scanner teclado = new Scanner(System.in);
     System.out.print("Informe o valor do cateto 1: ");
     cateto1 = teclado.nextDouble();
     System.out.print("Informe o valor do cateto 2 : ");
     cateto2 = teclado.nextDouble();
     hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);
     System.out.print("Hipotenusa = "+hipotenusa);
     teclado.close();
   }
}