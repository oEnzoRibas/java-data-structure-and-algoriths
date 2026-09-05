package Etapa3.C12;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {

        /*
        Preencher vetor com posições alternadas de outro vetor
        Autor: Enzo Rocha Leite Diniz Ribas
        */
        

        int[] posicao1 = new int[20];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < 20; aux++){

            System.out.printf("Informe o número do %d colocado: ", (aux+1));

            posicao1[aux] = teclado.nextInt();

            for ( int x = 0; x < (posicao1.length/2); x++){
                System.out.println(x+1+"ª Dupla: "+posicao1[x]+"/"+posicao1[x+10]);

            }
        }
    }
}
