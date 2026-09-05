package Etapa3.C13.C13EXExtra03Pckg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13EXExtra03_Main {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        double salario;
        int qntDep;
        String nome;

        int resp = 0;
        boolean validInput = false;

        do {
            while (!validInput) {
                System.out.print("""
                                            
                        Bem vindo à tabela de IRPF
                                            
                        Escolha uma opção:
                                            
                        1 - Cadastrar novo nome
                        2 - Imprimir tabela
                                            
                                            
                        Digite -1 para sair;
                        """);
                try {
                    resp = teclado.nextInt();
                    teclado.nextLine(); // Clear the buffer

                    // Check if the response is valid
                    if (resp == -1) {
                        System.out.println("Saindo do programa...");
                        break; // Exit the loop if user wants to quit
                    } else if (resp == 1 || resp == 2) {
                        validInput = true; // Valid input received
                    } else {
                        System.out.println("Informe um valor válido!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Informe um valor válido!");
                    teclado.nextLine(); // Clear invalid input
                }
            }


            switch (resp){

                case 1 -> {
                    System.out.println("Informe o nome:");
                    nome = teclado.nextLine();

                    System.out.println("Informe seu salário: ");
                    salario = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("Informe a quantidade de dependentes: ");
                    qntDep = teclado.nextInt();
                    teclado.nextLine();
                    C13EXExtra03_IRPFFicha.addFicha(nome, salario, qntDep);
                }
                case 2 -> C13EXExtra03_IRPFFicha.printFichaAlfBt();
            }
        }while (resp != -1);
        System.out.println("Programa Finalizado!");
        teclado.close();
    }
}
