import java.util.Scanner; 
public class TrimestreIf {
   public static void main(String[] args) {
      int mes;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o número do ano: ");
      mes = teclado.nextInt();
      if (mes < 1 || mes > 12)
         System.out.println("Código do mês inválido");
      else if (mes <= 3)
              System.out.println("Mês pertence 1º trimestre");
           else if (mes <= 6)
                   System.out.println("Mês pertence 2º trimestre");
                else if (mes <= 9)
                        System.out.println("Mês pertence 3º trimestre");
                     else
                        System.out.println("Mês pertence 4º trimestre");
      teclado.close();
   }
}