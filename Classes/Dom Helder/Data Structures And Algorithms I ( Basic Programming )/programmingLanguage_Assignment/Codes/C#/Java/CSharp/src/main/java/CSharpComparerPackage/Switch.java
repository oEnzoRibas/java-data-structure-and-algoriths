package CSharpComparerPackage;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int pts;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua pontuação na prova: ");
        pts = teclado.nextInt();

        switch (pts){
            case 1,2,3,4,5->{
                System.out.println("Você foi reprovado!");
            }
            case 6,7,8,9,10->{
                System.out.println("Você foi aprovado!");
            }
        }
    }
}
