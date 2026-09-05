import java.util.Scanner;

public class TrimestreSwitchNovo {

	public static void main(String[] args) {
	      int mes;
	      Scanner teclado = new Scanner(System.in);
	      System.out.print("Entre com o número do ano: ");
	      mes = teclado.nextInt();
	      switch (mes) {
	          case 1,2,3 ->
	             System.out.println("Mês pertence 1º trimestre");
	          case 4,5,6 ->
	             System.out.println("Mês pertence 2º trimestre");
	          case 7,8,9 ->
	             System.out.println("Mês pertence 3º trimestre");
	          case 10,11,12 ->
	             System.out.println("Mês pertence 4º trimestre");
	          default -> 
	             System.out.println("Código do mês inválido");
	      }
	      teclado.close();
	}

}
