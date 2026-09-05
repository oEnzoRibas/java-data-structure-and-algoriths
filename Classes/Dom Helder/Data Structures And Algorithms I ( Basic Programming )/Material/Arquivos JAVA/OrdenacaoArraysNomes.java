import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoArraysNomes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String Nomes[] = new String[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Digite um nome: ");
			Nomes[aux] = teclado.nextLine();
		}
		// ORDENA EM ORDEM DECRESCENTE (ALFABÉTICA)
		Arrays.sort(Nomes, Collections.reverseOrder());
		for (String nome : Nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}
}
