package Etapa3.C13.C13EX06Pckg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);
        int qnt = 10, qntNomesFml = 0;
        String sobrenome;

        List<String> nomesArrLst = new ArrayList<String>();

        System.out.println("Informe o nome de uma família: ");
        sobrenome = teclado.nextLine();

       for (int i = 0; i < qnt; i++){
           System.out.println("Informe um nome: ");
           nomesArrLst.add(teclado.nextLine());
       }

       for (int i = 0; i < qnt; i++){
           String finaltemp;
           finaltemp = nomesArrLst.get(i);
           if (finaltemp.endsWith(" "+sobrenome)){
               qntNomesFml ++;
           }
       }
        System.out.printf("Existem um total de %d pessoas com esse sobrenome",qntNomesFml);
    }
}
