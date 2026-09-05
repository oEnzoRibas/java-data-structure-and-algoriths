import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoArraysNomesCrescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String Nomes[] = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um nome: ");
			Nomes[i] = teclado.nextLine();
		}
		// ORDENA EM ORDEM CRESCENTE (ALFABÉTICA)
		System.out.println("Ordem crescente......");
		Arrays.sort(Nomes);
		for (String nome : Nomes)
			System.out.println(nome);
	    teclado.close();
	}
}
