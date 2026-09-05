import java.util.Scanner;
public class CalculaINSSb {
	public static void main(String[] args) {
		double salario, inss;
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Digite o valor do seu salário: ");
	    salario = teclado.nextDouble();
        if (salario <= 300) 
           inss = salario * 0.08;
        else 
           if (salario <= 1000) 
              inss = salario * 0.09;
           else 
              inss = salario * 0.1;
        System.out.println("Valor do INSS = " + inss);
        teclado.close();
	}
}