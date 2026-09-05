package Etapa3.C12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {

        /*
        Pesquisa de aluno em uma array.
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        List<String> nomesArrList = new ArrayList<>();
        List<String> RAArrList = new ArrayList<>();

        String nomeStr, RAStr, tempNome, tempRA;
        Scanner teclado = new Scanner(System.in);

        // Preenchimento das Array Lists
        System.out.println("Para encerrar o cadastro digite '0' no Nome");

        System.out.println("Informe o Nome do aluno: ");
        nomeStr = teclado.nextLine();

        do {

            if (nomeStr.equalsIgnoreCase("0")){
                break;
            }else {

                if (!(nomeStr.equalsIgnoreCase("0"))) {
                    System.out.println("Informe o Registro Acadêmico: ");
                    RAStr = teclado.nextLine();

                    RAArrList.add(RAStr);
                    nomesArrList.add(nomeStr);
                }

                System.out.println("Informe o Nome do aluno: ");
                nomeStr = teclado.nextLine();
            }
        } while (!(nomeStr.equalsIgnoreCase("0")));

        // Ordenação das Array Lists em ordem alfabetica crescente
        for (int i = 0; i < nomesArrList.size(); i++) {
            for (int x = 0; x < nomesArrList.size() - 1; x++) {
                if (nomesArrList.get(x).compareToIgnoreCase(nomesArrList.get(x + 1)) > 0) {
                    tempNome = nomesArrList.get(x);
                    nomesArrList.set(x, nomesArrList.get(x + 1));
                    tempRA = RAArrList.get(x);
                    RAArrList.set(x, RAArrList.get(x + 1));
                }
            }
        }

        //Pesquisa na Array List

        System.out.println("Informe um nome a ser pesquisado: ");
        String nomePes = teclado.nextLine();

        for (int i = 0; i < RAArrList.size(); i++) {
            if (nomesArrList.contains(nomePes)) {
                if (nomesArrList.get(i).equalsIgnoreCase(nomePes)) {

                    System.out.printf("""
                            NOME ENCONTRADO!
                                                    
                            Aluno: %s
                            RA: %s
                            Posição na lista: %d
                            """, nomesArrList.get(i), RAArrList.get(i), (i+1));

                }
            }else {

                System.out.println("NOME NÃO ENCONTRADO!");
            }
        }
    }
}