package Etapa3.C12;

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {

        /*
    Ler pessoas em uma fila
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        int qnt = 10;

        String fila [] = new String[qnt];
        String nome;
        int pos = -1;

        for (int i = 0; i < qnt; i++){
            System.out.printf("\nInforme o nome da pessoa na posição %d da fila:",i+1);
            fila[i] = teclado.nextLine();
        }


        System.out.println("Informe o nome que você quer saber a posição na fila: ");
        nome = teclado.nextLine();

        for (int j = 0; j < qnt; j++){
            if (nome.equalsIgnoreCase(fila[j])){
                pos = (j+1);
                break;
            }
        }
        if (pos == -1){
            System.out.println("O nome informado não se encontra na fila");
        }else {
            System.out.printf("O nome informado se encontra na posição %d da fila",(pos));
        }
    }
}
