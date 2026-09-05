package Etapa3.C13.C13EXExtra01Pckg;

import java.util.Scanner;

public class C13EXExtra01 {
    public static void main(String[] args) {

        /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

        Scanner teclado = new Scanner(System.in);

        double salario, salarioDepAbt, imposto;
        int qntDep;

        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();

        System.out.println("Informe a quantidade de dependetes: ");
        qntDep = teclado.nextInt();

        salarioDepAbt = salario-qntDep*150;

        if (salarioDepAbt < 1000){
            imposto = 0;
        }else if (salarioDepAbt < 5000){
            imposto = salarioDepAbt * (0.1);
        }else if (salarioDepAbt < 10000){
            imposto = salarioDepAbt * (0.15);
        }else {
            imposto = salarioDepAbt * (0.2);
        }

        System.out.println("Valor a pagar de IRPF: "+imposto);


        teclado.close();
    }
}