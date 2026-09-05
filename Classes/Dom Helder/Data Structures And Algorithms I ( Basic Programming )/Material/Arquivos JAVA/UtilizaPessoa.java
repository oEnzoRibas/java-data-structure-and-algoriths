
public class UtilizaPessoa {

	public static void main(String[] args) {
	    // Instanciando objetos de Pessoa
	    Pessoa p0 = new Pessoa();
	    p0.nome = "Ricardo Luiz de Freitas";
	    p0.anoNasc = 1963;
	    Pessoa p1 = new Pessoa();
	    p1.nome = "Rodrigo Duarte de Freitas";
	    p1.anoNasc = 1985;
	    // Acessando diretamente os atributos da classe
	    System.out.println("Nome: " + p0.nome);
	    System.out.println("Ano Nascimento: " + p0.anoNasc);             
	    // Chamando o método da classe
	    p0.ImprimePessoa();
	    p1.ImprimePessoa();   
	}

}
