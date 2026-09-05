package Etapa2.C08;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {

        // Calcular se um número é primo ou não
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro maior que zero: ");
        int contDiv = 0, num = teclado.nextInt();


        for (int i = 1; i <= num; i++){
            if (num%i == 0){
                contDiv++;
            }
        }
        if (contDiv <= 2){
            System.out.println("O número "+num+" é primo.");
        }else System.out.println("O número "+num+" não é primo.");
    }
}
