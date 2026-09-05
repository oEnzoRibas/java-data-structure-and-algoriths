import java.util.Scanner; 
public class TesteFuncao {
	static String nome;
	static int resultado;
	public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	int valor, resultado;
    	System.out.println("Informe um valor: ");
    	valor = teclado.nextInt();
    	funcao(valor);
    	//System.out.println("Resultado = "+funcao(valor));
    	teclado.close();
	}
	public static int funcao(int numero) {
		int resultado;
		resultado = numero * 1000;
		System.out.println("Resultado = "+resultado);
		return resultado;
	}
}
