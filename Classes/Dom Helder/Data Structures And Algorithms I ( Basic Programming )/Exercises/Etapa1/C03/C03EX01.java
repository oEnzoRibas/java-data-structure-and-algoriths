package Etapa1.C03;

import java.util.Scanner;
public class C03EX01 {
    // Função : Calcular o fatorial de um número qualquer
    // Autor : Enzo Rocha Leite Diniz Ribas
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Informe um número: ");
        double numero = teclado.nextLong();
        double fatorial = 1L;
        for(double contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }
        System.out.println("Fatorial = " + fatorial);
        teclado.close();
    }
}
