import java.util.Scanner;

public class CalculaINSS4c {
	public static void main(String[] args) {
		double salario, inss;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do seu salário: ");
		salario = teclado.nextDouble();
		if (salario <= 300) {
			inss = salario * 0.08;
			System.out.println("Funcionário caiu na alíquota de 8%");
		} else {
			inss = salario * 0.1;
			System.out.println("Funcionário caiu na alíquota de 10%");
		}
		System.out.println("Valor do INSS = " + inss);
		teclado.close();
	}
}