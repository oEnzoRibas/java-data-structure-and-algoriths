import java.util.Scanner;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe sua idade: ");
		idade = teclado.nextInt();
		teclado.close();
	}
}
