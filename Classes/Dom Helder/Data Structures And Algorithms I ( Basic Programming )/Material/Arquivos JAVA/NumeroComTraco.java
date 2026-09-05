import java.util.Scanner; 
public class NumeroComTraco {
   public static void main(String[] args) {
      int numero, d1, d2, d3;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Informe número inteiro de 3 dígitos: ");
      numero = teclado.nextInt();
      d1 = numero / 100;
      d2 = numero / 10 % 10;
      d3 = numero % 10;
      System.out.println(d1+"-"+d2+"-"+d3);
      teclado.close();
   }
}
