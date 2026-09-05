import java.util.Scanner;

public class Exemplo3If {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = teclado.nextInt();
		if (numero >= 10 && numero <= 100)
			System.out.println("Número está entre 10 e 100");
		else
			System.out.println("Número está FORA DA FAIXA");
		System.out.print("Fim do programa");
		teclado.close();
	}
}