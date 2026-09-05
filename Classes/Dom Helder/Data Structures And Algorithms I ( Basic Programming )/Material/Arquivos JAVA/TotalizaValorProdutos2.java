import java.util.Scanner; 
public class TotalizaValorProdutos2 {
   public static void main(String[] args) {
     double custo, totalAPagar = 0;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=20; aux++) {
        System.out.print("Custo do produto : R$ ");
        custo = teclado.nextDouble();
        totalAPagar += custo;
        System.out.println("Subtotal a pagar = R$"+totalAPagar);
     }
     System.out.print("Total a pagar = R$"+totalAPagar);
     teclado.close();
   }
}
