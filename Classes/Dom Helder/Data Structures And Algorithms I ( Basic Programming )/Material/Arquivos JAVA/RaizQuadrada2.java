import java.util.Scanner;

public class RaizQuadrada2 {
	public static void main(String[] args) {
		int numero;
		double raiz;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe um número inteiro: ");
			numero = teclado.nextInt();
			if (numero != 0) {
				raiz = Math.sqrt(numero);
				System.out.println("A raiz quadrada de " + numero + " = " + raiz);
			}
		} while (numero != 0);
		teclado.close();
	}
}
