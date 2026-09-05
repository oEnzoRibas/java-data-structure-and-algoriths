package Etapa2.C10;

import java.util.Scanner;

public class C10EX02 {
  public static void main(String[] args) {

    // Calcular e a média, valor total e quantidade de valores acima de 1000
    // Autor: Enzo Rocha Leite Diniz Ribas

    Scanner teclado = new Scanner(System.in);
    double valor, soma = 0, media;
    int cont = 0, cont1000 = 0;

    do {

      System.out.println("Informe o valor recebido: \nPara finalizar o programa digite = '0'");
      valor = teclado.nextDouble();

      if (valor != 0){

        soma += valor;
        cont++;

          if (valor > 1000){
             cont1000++;
          }

      }

    } while (valor != 0);
    media = soma / cont;
    System.out.println("\nMédia dos valores recebidos = "+media+
            "\nValor total recebido = "+soma+
            "\nQuantidade de valores recebidos acima de R$1000,00 = "+cont1000);

  }
}
