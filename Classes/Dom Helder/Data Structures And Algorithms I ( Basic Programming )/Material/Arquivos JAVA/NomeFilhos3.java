import java.util.Scanner; 
public class NomeFilhos3 {
   public static void main(String[] args) {
      String nome, nomeMae;
      int numFilhos;
      double salario;
      Scanner arquivo = new Scanner(
              NomeFilhos3.class.getResourceAsStream("pessoa.txt"));
      nome = arquivo.nextLine();
      numFilhos = arquivo.nextInt();
      salario = arquivo.nextDouble();
      arquivo.nextLine();
      nomeMae = arquivo.nextLine();
      System.out.println("Nome: "+nome);
      System.out.println("Quantidade de filhos: "+numFilhos);
      System.out.println("Salário: R$"+salario);
      System.out.println("Mãe: "+nomeMae);
      arquivo.close();
   }
}
