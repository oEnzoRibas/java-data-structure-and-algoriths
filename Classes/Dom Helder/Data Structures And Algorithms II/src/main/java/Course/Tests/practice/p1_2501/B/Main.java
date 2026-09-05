package Course.Tests.practice.p1_2501.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kIn = new Scanner(System.in);
        System.out.println("digite a quantiadede de prafusos");

        int qtd = kIn.nextInt();

        CompraParafusos cp = new CompraParafusos();

        try {
            cp.setQuantidade(qtd);
        }catch (QuantidadeInvalidaException ex){
            System.out.println("Erro! "+ ex.getMessage());
        }

        double valorTotal = cp.calculaTotal(qtd);

        System.out.println("Valor final (com desconto aplicado): "+ valorTotal);
    }
}
