import java.util.Scanner; 

public class CalculaMassaCorporal {
   public static void main(String[] args) {
     double peso, massa;     
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=5; aux++) {
        System.out.print("Entre com o peso: ");
        peso = teclado.nextDouble();
        massa = peso / 9.8;
        System.out.println("Massa Corporal = "+massa);
        System.out.println();
     }
     teclado.close();
   }
}