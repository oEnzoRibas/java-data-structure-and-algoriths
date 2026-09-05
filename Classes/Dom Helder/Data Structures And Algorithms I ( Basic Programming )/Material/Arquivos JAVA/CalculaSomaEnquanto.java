import java.util.Scanner;

public class CalculaSomaEnquanto {

	public static void main(String[] args) {
		int numero, soma = 0, cont = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite -1");
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		while (numero != -1) {
			soma += numero;
			cont++;
			System.out.print("Informe um número: ");
			numero = teclado.nextInt();
		}
		media = (float) soma / cont;
		System.out.println("Média = " + media);
		teclado.close();
	}

}
