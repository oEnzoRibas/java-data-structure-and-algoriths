package Etapa1.C06;

import javax.swing.*;
import java.util.Scanner;
// Calcular salário comissionado
// Autor: Enzo Rocha Leite Diniz Ribas
public class C06EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vendas, salario, salarioBase= 240, comissao = 0;
        System.out.println("Digite o valor das vendas feitas nesse mês: ");
        vendas = teclado.nextDouble();
        if (vendas <= 1000){
            comissao = 0;
        }else if (vendas > 1000 && vendas < 10000){
            comissao = vendas*0.1;
        }else if (vendas > 10000){
            comissao = 1000;
        }
        salario = (salarioBase+comissao);

        JOptionPane.showMessageDialog(null, "\nSalário Base: R$"+salarioBase+"\nComissão de Vendas: R$"+comissao+"\nSalário Total: "+salario,
                "Salário",
                JOptionPane.INFORMATION_MESSAGE);

        System.out.printf("\nSalário Base: R$"+salarioBase+"\nComissão de Vendas: R$"+comissao+"\nSalário Total: "+salario);


    }
}
