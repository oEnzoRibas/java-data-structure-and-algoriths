import java.util.Scanner;

public class LerArqTxt3 {
	public static void main(String[] args) {
		String nome, sexo;
		int idade;
		Scanner arquivo = new Scanner(LerArqTxt3.class.getResourceAsStream("nomes2.txt"));
		while (arquivo.hasNextLine()) {
			nome = arquivo.nextLine();
			System.out.println("Nome = " + nome);
			sexo = arquivo.nextLine();
			System.out.println("Sexo = " + sexo);
			idade = arquivo.nextInt();
			System.out.println("Idade = " + idade);
			if (arquivo.hasNextLine())
				arquivo.nextLine(); // bug do Java
		}
		arquivo.close();
	}
}
