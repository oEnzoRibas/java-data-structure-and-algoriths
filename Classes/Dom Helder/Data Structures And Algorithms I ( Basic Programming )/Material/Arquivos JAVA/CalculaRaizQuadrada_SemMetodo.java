import java.util.Scanner;
public class CalculaRaizQuadrada_SemMetodo {
	public static void main(String[] args) {
		double raiz;
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero inteiro: ");
		numero = teclado.nextInt();
		if (numero > 0)
			raiz = Math.sqrt(numero);
		else
			raiz = 0;
		System.out.print("Raiz quadrada = " + raiz);
		teclado.close();
	}
}
