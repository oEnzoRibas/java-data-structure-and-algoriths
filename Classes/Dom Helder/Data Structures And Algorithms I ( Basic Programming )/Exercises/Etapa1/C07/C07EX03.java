package Etapa1.C07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        // Calcular valor de multa baseado nos dias de atraso do pagamento de um imposto
        // Autor: Enzo Rocha Leite Diniz Ribas

        double multa, imposto, total;
        int dias;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do imposto: ");
        imposto = teclado.nextDouble();
        System.out.println("Informe o número de dias de atraso: ");
        dias = teclado.nextInt();
        if (dias < 0 ){
            System.out.println("Informe um valor válido!");
            return;
        }

        switch (dias){
            case 0, 1, 2, 3, 4, 5 ->
                multa = 0;
            case 6, 7, 8 ->
                multa = ( imposto * ((double) 2 / 100) );
            case 9, 10 ->
                multa = ( (imposto / 10) + ((0.5)*dias) );
            default ->
                multa = ( (imposto * 1.5 )+ (dias) );
        }

        total = multa + imposto;

        System.out.printf("Imposto: %1.3f \nMulta: %1.3f \nTotal: %1.3f", imposto,multa,total);
    }
}
