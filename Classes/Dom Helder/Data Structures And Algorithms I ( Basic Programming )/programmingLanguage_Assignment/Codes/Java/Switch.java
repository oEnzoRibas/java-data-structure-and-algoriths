package TrabalhoCSharp;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Exemplo de um Switch Case em Java
        // @Autores: Enzo R. L. D. Ribas && Ana Luiza

        Scanner teclado = new Scanner(System.in);
        int pts;

        System.out.println("Informe a pontuação na prova: ");
        pts = teclado.nextInt();

        switch (pts){
            case 1,2,3,4,5->{
                System.out.println("Você foi reprovado!");
            }
            case 6,7,8,9,10->{
                System.out.println("Você foi aprovado!");
            }
            default -> System.out.println("Nova Inválida!");
        }
    }
}