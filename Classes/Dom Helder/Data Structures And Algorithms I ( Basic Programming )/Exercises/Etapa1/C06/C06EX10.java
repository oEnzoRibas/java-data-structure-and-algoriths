package Etapa1.C06;

import java.util.Scanner;

public class C06EX10 {
    public static void main(String[] args) {

        // Calcular rendimento de um Capital aplicado
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do Capital Aplicado: ");
        double capitalApl = teclado.nextDouble();
        System.out.println("Informe a quantidade de dias que o capital ficou aplicado: ");
        int numDiasCapital = teclado.nextInt();
        System.out.println("Informe o valor percentual da Taxa diária: ");
        double taxaDia = teclado.nextDouble();
        double taxaDiaPer = taxaDia/100;
        double valorResgatado, rendimento, impostoDeRenda;
        rendimento = capitalApl*taxaDiaPer*numDiasCapital;
        impostoDeRenda = rendimento*0.15;
        valorResgatado = capitalApl+rendimento-impostoDeRenda-10;
        System.out.println("O Valor resgatado será de: "+valorResgatado);
    }
}