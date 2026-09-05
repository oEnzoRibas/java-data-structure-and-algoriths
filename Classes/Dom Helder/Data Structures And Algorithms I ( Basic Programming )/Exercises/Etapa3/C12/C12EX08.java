package Etapa3.C12;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {

        /*
        Preencher vetor com posições alternadas somadas
        Autor: Enzo Rocha Leite Diniz Ribas
        */


        int[] posicao1 = new int[20];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < 20; aux++){

            System.out.printf("Informe %dª  número: ", (aux+1));

            posicao1[aux] = teclado.nextInt();

        }
        for ( int x = 0; x < (posicao1.length/2); x++){
            System.out.println ( posicao1[x]+posicao1[x+10]  );

        }
    }
}