import java.util.Scanner;

public class VetorMenorValor2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[10];
		int menor;
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		menor = vet[0];
		for (int aux = 1; aux < 10; aux++)
			if (vet[aux] < menor)
				menor = vet[aux];
		System.out.println("Menor valor do vetor = " + menor);
		teclado.close();
	}
}