package Etapa3.C12;

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {

        /*
    Pesquisar em uma lista se existe um bilhete sorteado
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        int qnt, bilheteSort, sort = -1;

        System.out.println("Informe a quantidade de bilhetes: ");
        qnt = teclado.nextInt();
        teclado.nextLine();

        int bilhete[] = new int[qnt];

        // Preenchimento do vetor
        for (int i = 0; i < qnt; i++){
            System.out.println("Informe o número do bilhete: ");
            bilhete[i] = teclado.nextInt();
        }

        // Declaração do bilhete sorteado
        System.out.println("Informe o número do bilhete sorteado: ");
        bilheteSort = teclado.nextInt();
        teclado.nextLine();

        // Pesquisa do bilhete sorteado no vetor
        for (int i = 0; i < qnt; i++){
            if (bilhete[i] == bilheteSort){
                sort = 1;
                break;
            }
        }

        if (sort == 1){
            System.out.println("Você foi premiado!!!");
        }else {
            System.out.println("Infelizmente, não foi dessa vez!");
        }
    }
}
