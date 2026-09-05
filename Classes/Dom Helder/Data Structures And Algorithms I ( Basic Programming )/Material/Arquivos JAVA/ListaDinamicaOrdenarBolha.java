import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDinamicaOrdenarBolha {

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
		String temp;
		for (int aux = 0; aux < listaNomes.size()-1; aux++)
			for (int x = 0; x < listaNomes.size()-1; x++)
				if (listaNomes.get(x).compareToIgnoreCase(listaNomes.get(x+1)) > 0) {
					temp = listaNomes.get(x);
					listaNomes.set(x,listaNomes.get(x+1));
					listaNomes.set(x+1,temp);
				}

		// IMPRIME O CONTEÚDO DE UMA LISTA DINÂMICA
//		for (String nomes : listaNomes)
//			System.out.println(nomes);
		for (int aux = 0; aux < listaNomes.size(); aux++)
			System.out.println(listaNomes.get(aux));
		
		teclado.close();
	}

}
