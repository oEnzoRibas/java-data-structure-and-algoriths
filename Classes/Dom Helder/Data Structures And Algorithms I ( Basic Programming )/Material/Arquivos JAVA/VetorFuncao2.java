import java.util.Scanner;

public class VetorFuncao2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[100];
		double func[] = new double[100];
		for (int aux = 0; aux < 100; aux++) {
			System.out.print("Informe um número: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 100; aux++)
			func[aux] = Math.pow(vet[aux], 2) - 1;
		for (int aux = 0; aux < 100; aux++)
			System.out.print("Número= " + vet[aux] + " F(x)=" + func[aux]);
		teclado.close();
	}
}