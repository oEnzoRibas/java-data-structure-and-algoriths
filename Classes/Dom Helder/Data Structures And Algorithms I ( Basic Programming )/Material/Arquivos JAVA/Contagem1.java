import java.util.Scanner;

public class Contagem1 {
	public static void main(String[] args) {
		int numero, cont1 = 0, cont2 = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 5; aux++) {
			System.out.print("Informe um número: ");
			numero = teclado.nextInt();
			if (numero < 0)
				cont1++;
			if (numero >= 0)
				cont2++;
		}
		System.out.println("Quantidade de números negativos = " + cont1);
		System.out.println("Quantidade de números positivos = " + cont2);
		teclado.close();
	}
}