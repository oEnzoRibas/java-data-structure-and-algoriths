import java.util.Scanner;

public class OrdemInversa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aux;
		int vet[] = new int[10];
		for (aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (aux = 9; aux >= 0; aux--)
			System.out.println(vet[aux]);
	}
}
