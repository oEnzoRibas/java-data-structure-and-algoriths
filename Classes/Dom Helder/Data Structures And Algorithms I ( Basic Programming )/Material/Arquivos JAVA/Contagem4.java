import java.util.Scanner;

public class Contagem4 {
	public static void main(String[] args) {
     int numero, cont = 0;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=5; aux++) {
        System.out.print("Informe um número: ");
        numero = teclado.nextInt();
        if (numero < 0) 
           cont++;
     }
     System.out.print("Quantidade de números negativos = "+cont);
     System.out.print("Quantidade de números positivos = "+(5 - cont));
     teclado.close();
   }
}