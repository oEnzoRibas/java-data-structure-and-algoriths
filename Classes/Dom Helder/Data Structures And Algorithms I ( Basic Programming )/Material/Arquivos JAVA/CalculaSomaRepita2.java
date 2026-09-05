import java.util.Scanner; 
public class CalculaSomaRepita2 {
   public static void main(String[] args) {
     int numero, soma = 0, cont = 0;
     double media;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Para finalizar  digite -1");           
     do {
       System.out.print("Informe um número: ");
       numero = teclado.nextInt();
       if (numero != -1) {
          soma += numero;
          cont++;
       }
     } while (numero != -1); 
     media = (float) soma / cont;
     System.out.println("Média = "+media);
   }
}

