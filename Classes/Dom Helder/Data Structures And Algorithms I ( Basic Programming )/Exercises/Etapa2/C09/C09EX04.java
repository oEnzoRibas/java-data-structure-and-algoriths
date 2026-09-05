package Etapa2.C09;

import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {

        // Fazer a serie matematica
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de termos que você quer testar: ");

        int rep = teclado.nextInt();
        double serie = 0, num , den;

        for (int aux = 1; aux <= rep*4; aux+=4){
            num = aux*(aux+1);
            den = (aux+2)*(aux+3);
            serie += (num/den);
        }
        System.out.println(Math.sqrt(serie));
    }
}
