import java.util.Scanner;
public class TesteFuncaoChamadaExterna {
	public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	TesteFuncao.nome = "";
    	int valor;
    	System.out.println("Informe um valor: ");
    	valor = teclado.nextInt();
    	System.out.println("Resultado = "+TesteFuncao.funcao(valor));
    	teclado.close();
	}

}
