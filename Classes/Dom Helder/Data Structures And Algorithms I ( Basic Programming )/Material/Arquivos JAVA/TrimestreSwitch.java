import java.util.Scanner; 
public class TrimestreSwitch {
   public static void main(String[] args) {
      int mes;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Entre com o número do ano: ");
      mes = teclado.nextInt();
      switch (mes) {
          case 1: case 2: case 3:
             System.out.println("Mês pertence 1º trimestre");
             break;
          case 4: case 5: case 6:
             System.out.println("Mês pertence 2º trimestre");
             break;
          case 7: case 8: case 9:
             System.out.println("Mês pertence 3º trimestre");
             break;
          case 10: case 11: case 12:
             System.out.println("Mês pertence 4º trimestre");
             break;
          default: 
             System.out.println("Código do mês inválido");
             break;
      }
      teclado.close();
   }
}