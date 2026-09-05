package Etapa3.C12;

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {

      /*
    Pesquisar e imprimir se um morador existe na db e pesquisar a placa do carro
    Autor: Enzo Rocha Leite Diniz Ribas
    */

        Scanner teclado = new Scanner(System.in);

        int qnt = 2;
        String nomeOrPlaca;

        String nome[] = new String[100];
        String placa[] = new String[100];

        for (int i = 0; i < qnt; i++) {
            System.out.println("Informe seu nome: ");
            nome[i] = teclado.nextLine();
            System.out.println("Informe sua placa: ");
            placa[i] = teclado.nextLine();
        }

        int found = 0;
        do {

            System.out.println("Informe seu nome ou sua placa: ");
            nomeOrPlaca = teclado.nextLine();

            for (int i = 0; i < qnt; i++) {
                if (nome[i].equalsIgnoreCase(nomeOrPlaca) || placa[i].equalsIgnoreCase(nomeOrPlaca)) {
                    System.out.printf("Nome: %s\nPlaca: %s\nNúmero da Vaga: %d", nome[i], placa[i], i);
                    found = -1;
                    break;
                } else if (i == qnt-1){
                    System.out.println("Usuário não encontrado!!!\n");
                }
            }

        } while (found != -1);

    }
}

