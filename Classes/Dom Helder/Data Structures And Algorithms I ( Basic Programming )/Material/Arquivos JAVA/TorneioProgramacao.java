import java.util.Scanner;

public class TorneioProgramacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pontos[] = new int[100];
		String nomes[] = new String[100];
		String tempNome;
		int tempPontos;
		for (int aux = 0; aux < nomes.length; aux++) {
			System.out.println("Informe nome do competidor " + (aux + 1) + ":");
			nomes[aux] = teclado.nextLine();
			System.out.println("Informe quantidade de pontos perdidos:");
			pontos[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < nomes.length - 1; aux++)
			for (int x = 0; x < nomes.length - 1; x++)
				if (pontos[x] > pontos[x + 1]) {
					tempNome = nomes[x];
					nomes[x] = nomes[x + 1];
					nomes[x + 1] = tempNome;
					tempPontos = pontos[x];
					pontos[x] = pontos[x + 1];
					pontos[x + 1] = tempPontos;
				}
		System.out.println("Premiação:");
		for (int aux = 0; aux < 3; aux++)
			System.out.println("Competidor na " + (aux + 1) + "a colocação: " + nomes[aux]);
		System.out.println("Informe nome do competidor a procurar:");
		String nomeProcurar = teclado.nextLine();
		int pos = -1;
		for (int aux = 0; aux < 10; aux++)
			if (nomeProcurar.equalsIgnoreCase(nomes[aux]))
				pos = aux;
		if (pos >= 0)
			System.out.println("Competidor está no TOP 10, na " + (pos + 1) + "a colocação");
		else
			System.out.println("Nome não encontrado!");
		teclado.close();
	}

}
