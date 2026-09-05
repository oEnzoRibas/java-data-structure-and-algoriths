import java.util.Scanner;
public class CalculaRaizQuadrada_ComMetodoComParametro {
	public static void main(String[] args) {
		double raiz;
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero inteiro: ");
		numero = teclado.nextInt();
		raiz = RaizQuadrada(numero);
		System.out.print("Raiz quadrada = " + raiz);
		teclado.close();
	}
	static double RaizQuadrada(int num) {
		if (num > 0)
			return Math.sqrt(num);
		else
			return 0;
	}
}