import java.util.Scanner; 
public class CalculaSomaRepita {
   public static void main(String[] args) {
     int numero,soma = 0;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Para finalizar  digite 0");           
     do {
       System.out.print("Informe um número: ");
       numero = teclado.nextInt();
       soma += numero;
     } while (numero != 0); 
     System.out.println("Soma = "+soma);
   }
}

