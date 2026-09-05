import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoListaNomes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// DECLARAÇÃO DE UMA LISTA, O QUE FICAR DENTRO DE <> É O TIPO DE OBJETO QUE A LISTA ESPERA
		List<String> listaNomes = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um nome: ");
			String nome = teclado.nextLine();
			// ADICIONA O NOME NA LISTA
			listaNomes.add(nome);
		}
		// ORDENA EM ORDEM CRESCENTE (ALFABÉTICA)
		listaNomes.sort(null);
		// O PARÂMETRO INDICA QUE A ORDENAÇÃO TEM QUE DESCONSIDERAR SE FOR MAIUSCULAS OU MINUSCULAS
		// listaNomes.sort(String.CASE_INSENSITIVE_ORDER);
		
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		teclado.close();
	}
}
