import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class ListaDinamicaOrdenar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;

		// DECLARAÇÃO DE UMA LISTA DINÂMICA DE STRING
		List<String> listaNomes = new ArrayList<String>();

		do {
			System.out.print("Digite um nome (X para encerrar): ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("X"))
				// ADICIONA O NOME NA LISTA
				listaNomes.add(nome);
		} while (!nome.equalsIgnoreCase("X"));

		// ORDENA EM ORDEM CRESCENTE (ALFABÉTICA)
		listaNomes.sort(null);
		// ORDENA EM ORDEM CRESCENTE DESCONSIDERANDO MAÍUSCULO/MINÚSCULO
		listaNomes.sort(String.CASE_INSENSITIVE_ORDER);
		// ORDENA EM ORDEM DECRESCENTE (ALFABÉTICA INVERSA)
		listaNomes.sort(new Comparator<String>() {
			public int compare(String ordena1, String ordena2) {
				return ordena2.compareToIgnoreCase(ordena1);
			}
		});

		// IMPRIME O CONTEÚDO DE UMA LISTA DINÂMICA
		for (String nomes : listaNomes)
			System.out.println(nomes);
		
		teclado.close();
	}
}
