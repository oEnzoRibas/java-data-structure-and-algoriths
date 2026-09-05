package Etapa2.C10;

import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {

        // Calcular preço total de uma compra
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        double pf, custoTotal = 0, txbdi,bdi, precoUn, custoParcial;
        String nome = null;
        int qnt;

        System.out.println("Infome a taxa BDI em %: ");
        txbdi = teclado.nextDouble();
        teclado.nextLine();

        do {

                System.out.println("\nInfome o nome do produto: \nPara finalizar o programa digite = 'FIM'");
                nome = teclado.nextLine();

            if (!(nome.equalsIgnoreCase("fim"))) {
                System.out.println("\nInfome a quantidade de produtos: ");
                qnt = teclado.nextInt();

                System.out.println("\nInforme o preço unitário do produto: ");
                precoUn = teclado.nextDouble();
                teclado.nextLine();

                custoParcial = qnt * precoUn;
                System.out.println("\nO custo parcial do produto " + nome + " é de: " + custoParcial);
                custoTotal += custoParcial;
            }


        } while (!(nome.equalsIgnoreCase("fim")));

        bdi = custoTotal * (txbdi/100);
        pf = custoTotal + bdi;
        System.out.println("\nPreço Final: "+pf);
    }
}
