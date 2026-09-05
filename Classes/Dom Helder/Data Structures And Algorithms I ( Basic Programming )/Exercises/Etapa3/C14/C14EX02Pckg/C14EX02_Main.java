package C14EX02Pckg;

import java.util.Scanner;

public class C14EX02_Main {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Sistema de Classes com Menu em POO
        Autor: Enzo Rocha Leite Diniz Ribas
         */

        int resp;

        System.out.println("""
                Selecione uma figura geométrica:
                
                1 - Quadrado
                2 - Retãngulo
                3 - Triângulo Retângulo
                4 - Círculo
                
                """);
        resp = teclado.nextInt();

        switch (resp){
            case 1: System.out.println("Área = "+C14EX02_Quadrado.area()); break;
            case 2: System.out.println("Área = "+C14EX02_Retângulo.area()); break;
            case 3: System.out.println("Área = "+C14EX02_TriânguloRetângulo.area()); break;
            case 4: System.out.println("Área = "+C14EX02_Círculo.area()); break;
        }
    }
}
