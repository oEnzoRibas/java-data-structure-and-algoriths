import java.util.Scanner; 
public class Somatorio {
   public static void main(String[] args) {
     int numero, soma = 0; 
     double media;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=5; aux++) {
        System.out.print("Informe um número inteiro: ");
        numero = teclado.nextInt();
        soma += numero;
     }
     media = soma / 5.0;
     System.out.println("A média deu "+media);
     teclado.close();
   }
}
