import java.util.Scanner;

public class CalculaSomaRepita3 {
	public static void main(String[] args) {
     int numero, soma = 0, cont = 0, pares = 0;
     double media;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Para finalizar digite -1");           
     do {
       System.out.print("Informe um número: ");
       numero = teclado.nextInt();
       if (numero != -1) {
          soma += numero;
          cont++;
          if (numero % 2 == 0)
             pares++;
       }
     } while (numero != -1); 
     media = (float) soma / cont;
     System.out.println("Média = "+media);
     System.out.println("Quant. de números pares = "+pares);
     teclado.close();
   }
}