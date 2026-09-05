import java.util.Scanner;

public class VetorFuncao3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[100];
		double func;
		for (int aux = 0; aux < 100; aux++) {
			System.out.print("Informe um número: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 100; aux++) {
			func = Math.pow(vet[aux], 2) - 1;
			System.out.print("Número= " + vet[aux] + " F(x)=" + func);
		}
		teclado.close();
	}
}