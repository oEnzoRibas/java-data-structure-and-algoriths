import java.util.Scanner;

public class Exemplo1If {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = teclado.nextInt();
		if (numero > 10)
			System.out.println("Número MAIOR que 10");
		System.out.println("Fim do programa");
		teclado.close();
	}
}