import java.util.Scanner;

public class VetorPar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int vet[] = new int[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (vet[aux] % 2 == 0)
				cont++;
		}
		System.out.println("Quantidade de números pares = " + cont);
		teclado.close();
	}
}