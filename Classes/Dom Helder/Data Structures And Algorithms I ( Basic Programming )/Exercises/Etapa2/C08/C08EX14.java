package Etapa2.C08;

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {

        // Imprimir matriz de caracteres informada pelos usuarios
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        String simbolo;
        int num;

       System.out.println("Informe um número entre 1 e 20: ");
        num = Integer.parseInt(teclado.nextLine());

        if (num < 1 || num >20){
            System.out.println("Número inválido. Por favor insira um número entre 1 e 20");
        return;
        }

        System.out.println("Informe um símbolo: ");

        simbolo = teclado.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.print("\n");

            for (int x = 1; x <= num; x++) {
                System.out.print(simbolo+" ");
            }

        }

        System.out.print("\n");
        teclado.close();
    }
}
