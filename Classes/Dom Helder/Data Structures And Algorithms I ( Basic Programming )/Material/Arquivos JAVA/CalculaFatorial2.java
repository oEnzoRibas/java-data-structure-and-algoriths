import java.util.Scanner; 
public class CalculaFatorial2 {
   public static void main(String[] args) {
     long fatorial = 1L, numero;
     Scanner teclado = new Scanner(System.in);
     System.out.print("Informe um número inteiro: ");
     numero = teclado.nextLong();
     for (int aux=2; aux<=numero; aux++)
        fatorial *= aux;
     System.out.print("Fatorial de "+numero+" = "+fatorial);
     teclado.close();
   }
}
