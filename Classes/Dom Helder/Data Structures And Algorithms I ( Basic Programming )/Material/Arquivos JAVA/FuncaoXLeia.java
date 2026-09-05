import java.util.Scanner;

public class FuncaoXLeia {
	public static void main(String[] args) {
		int x;
		double fx;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 10; aux++) {
			System.out.print("Informe o valor de x: ");
			x = teclado.nextInt();
			fx = Math.pow(x, 2) - 1;
			System.out.println("x = " + x + " f(x) = " + fx);
		}
		teclado.close();
	}
}
