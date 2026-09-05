package Etapa1.C06;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args) {

        // Calcular Raízes da Função de segundo grau
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do coeficiente a: ");
        double a = teclado.nextDouble();
        System.out.println("Informe o valor do coeficiente b: ");
        double b = teclado.nextDouble();
        System.out.println("Informe o valor do coeficiente c: ");
        double c = teclado.nextDouble();

        double delta = ((Math.pow(b,2)) - (4 * a * c));

        if (delta > 0){
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("S = {%f e %f}", raiz1, raiz2);
        } else if (delta == 0){
            double raiz = (-b / (2 * a));
            System.out.printf("S = {%f}", raiz);
        }else {
            System.out.println("S = {}");
        }
    }
}
