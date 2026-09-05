package Etapa1.C05;

import java.util.Scanner;
// Calcular Valor Retido Imposto de Renda
// Autor: Enzo Rocha Leite Diniz Ribas
public class C05EX03 {
    public static void main(String[] args) {
        double salarioDoub, liquido, impostoderenda;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        String salarioStr = teclado.nextLine();
        salarioDoub = Double.parseDouble(salarioStr);
        System.out.println("Digite o número de dependentes: ");
        String numDepStr = teclado.nextLine();
        int numDep = Integer.parseInt(numDepStr);
        liquido = (salarioDoub-(numDep*60));
        impostoderenda = (liquido*(15/100.0));
        System.out.println("Valor retido de Imposto de Renda = "+impostoderenda);

    }
}
