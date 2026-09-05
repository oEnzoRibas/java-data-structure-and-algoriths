package Etapa3.C13.C13EXExtra02Pckg;

import java.util.Scanner;

public class C13EXExtra02 {
    public static double salarioDepAbt;

    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        double salario;
        int qntDep;

        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();

        System.out.println("Informe a quantidade de dependetes: ");
        qntDep = teclado.nextInt();

        System.out.println("Valor a pagar de IRPF: "+ imposto(salario,qntDep));

        teclado.close();
    }

    public static double imposto(double salario, int qntDep){

        salarioDepAbt = salario-qntDep*150;

        if (salarioDepAbt < 1000){
            return 0;
        }else if (salarioDepAbt < 5000){
            return salarioDepAbt * (0.1);
        }else if (salarioDepAbt < 10000){
            return salarioDepAbt * (0.15);
        }else {
            return salarioDepAbt * (0.2);
        }
    }
}