import java.util.Scanner; 
public class RaizQuadradaRepita {
   public static void main(String[] args) {
     int numero;
     double raiz;
     Scanner teclado = new Scanner(System.in);
     do {
       System.out.print("Informe um número inteiro: ");
       numero = teclado.nextInt();
       raiz = Math.sqrt(numero);
       System.out.println("A raiz quadrada de "+numero+" = "+raiz);
     } while (numero != 0); 
     teclado.close();
   }
}

