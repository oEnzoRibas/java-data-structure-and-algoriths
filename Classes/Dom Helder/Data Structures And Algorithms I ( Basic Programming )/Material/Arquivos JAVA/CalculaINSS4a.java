import java.util.Scanner;

public class CalculaINSS4a {
	public static void main(String[] args) {
		double salario, inss = 0f;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do seu salário: ");
		salario = teclado.nextDouble();
		if (salario <= 300)
			inss = salario * 0.08;
		if (salario > 300)
			inss = salario * 0.1;
		System.out.println("Valor do INSS = " + inss);
		teclado.close();
	}
}