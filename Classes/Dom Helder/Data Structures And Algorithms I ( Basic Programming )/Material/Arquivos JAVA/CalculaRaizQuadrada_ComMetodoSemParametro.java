import java.util.Scanner;
public class CalculaRaizQuadrada_ComMetodoSemParametro {
	static double raiz;
	static int numero;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero inteiro: ");
		numero = teclado.nextInt();
		RaizQuadrada();
		System.out.print("Raiz quadrada = " + raiz);
		teclado.close();
	}
	static void RaizQuadrada() {
		if (numero > 0)
			raiz = Math.sqrt(numero);
		else
			raiz = 0;
	}
}
