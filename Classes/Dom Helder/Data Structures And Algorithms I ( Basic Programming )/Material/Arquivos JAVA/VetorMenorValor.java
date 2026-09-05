import java.util.Scanner;

public class VetorMenorValor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[10];
		int menor = 0;
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++)
			if (aux == 0 || vet[aux] < menor)
				menor = vet[aux];
		System.out.println("Menor valor do vetor = " + menor);
		teclado.close();
	}
}