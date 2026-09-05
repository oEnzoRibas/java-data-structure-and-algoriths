import java.util.Scanner;

public class OrdenacaoVetoresNotasNomes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tempNota, nota1, nota2, nota3;
		String tempNome;
		double NOTAS[] = new double[10];
		String NOMES[] = new String[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe o nome do aluno:  ");
			NOMES[aux] = teclado.nextLine();
			System.out.print("Informe a nota 1:  ");
			nota1 = teclado.nextDouble();
			System.out.print("Informe a nota 2:  ");
			nota2 = teclado.nextDouble();
			System.out.print("Informe a nota 3:  ");
			nota3 = teclado.nextDouble();
			NOTAS[aux] = (nota1 + nota2 + nota3) / 3;
			teclado.nextLine();
		}
		for (int aux = 0; aux < 9; aux++)
			for (int x = 0; x < 9; x++)
				if (NOTAS[x] < NOTAS[x + 1]) {
					tempNota = NOTAS[x];
					NOTAS[x] = NOTAS[x + 1];
					NOTAS[x + 1] = tempNota;
					tempNome = NOMES[x];
					NOMES[x] = NOMES[x + 1];
					NOMES[x + 1] = tempNome;
				}
		for (int aux = 0; aux < 10; aux++)
			System.out.println(NOMES[aux]);
		teclado.close();
	}
}
