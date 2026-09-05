package Etapa2.C09;

import java.util.Scanner;

public class  C09EX03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int rep, passo = 4;
        double num, den = 0, serie = 0;

        System.out.println("Informe o número de termos: ");
        rep = teclado.nextInt();

        for (int aux = 4; aux <= rep*4; aux+=passo){
            num = 1 + Math.sqrt(aux);
            den += 3;
            serie += (num / den);
        }
        System.out.println("Valor da série: "+serie);
    }
}