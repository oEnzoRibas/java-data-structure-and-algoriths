package Etapa3.C12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        List <String> nomesArrayLst = new ArrayList<>();
        String nome;
        List <Double> salarioArrayLst = new ArrayList<>();
        double salario;

        System.out.println("\nInforme 'x' No NOME Para Encerrar o programa.");
        do {

            System.out.println("\nInforme um nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe o salário: ");
            salario = teclado.nextDouble();

            if ((nome.equalsIgnoreCase("X"))){
                break;
            } else {
                nomesArrayLst.add(nome);
                teclado.nextLine();
                salarioArrayLst.add(salario);

            }

        }while (! (nome.equalsIgnoreCase("X") ) );

        System.out.println("Informe um índice de reajuste salárial: ");
        double index = teclado.nextDouble();

        for (int i = 0; i < nomesArrayLst.size(); i++){
            if (salarioArrayLst.get(i) < 1000){
                salarioArrayLst.set(i,index);
            }
        }

        for (int i = 0; i < nomesArrayLst.size(); i++){
            System.out.println("Nome: "+nomesArrayLst.get(i));
            System.out.println("Salário Atualizado: "+salarioArrayLst.get(i));
        }
    }
}
