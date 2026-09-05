import java.util.Scanner; 
public class Somatorio2 {
   public static void main(String[] args) {
     int numero, soma = 0, cont = 0; 
     double media;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=5; aux++) {
        System.out.print("Informe um número inteiro: ");
        numero = teclado.nextInt();
        if (numero >= 1 && numero <= 100) {
           soma += numero;
           cont++;
        }
     }
     if (cont > 0) {
        media = (float) soma / cont;
        System.out.println("A média deu "+media);
     } 
     else
        System.out.println("Nenhum número está entre 1 e 100!");
     teclado.close();
   }
}
