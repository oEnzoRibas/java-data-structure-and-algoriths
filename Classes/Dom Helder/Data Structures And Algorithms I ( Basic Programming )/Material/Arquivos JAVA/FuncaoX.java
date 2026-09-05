import java.util.Scanner;

public class FuncaoX {
	public static void main(String[] args) {
		double fx;
		for (int aux = 1; aux <= 1000; aux++) {
			fx = Math.pow(aux, 2) - 1;
			System.out.println("x = " + aux + " f(x) = " + fx);
		}
	}
}
