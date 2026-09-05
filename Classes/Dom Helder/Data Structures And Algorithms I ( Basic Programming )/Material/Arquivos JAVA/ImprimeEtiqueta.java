import java.util.Scanner; 
public class ImprimeEtiqueta {
   public static void main(String[] args) {
      String nome, logradouro, bairro, cidade, uf, cep, numero;
      int sapato;
      float peso;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Informe seu nome: ");
      nome = teclado.nextLine();
      System.out.print("Informe seu logradouro: ");
      logradouro = teclado.nextLine();
      System.out.print("Informe seu número: ");
      numero = teclado.nextLine();
      System.out.print("Informe seu bairro: ");
      bairro = teclado.nextLine();
      System.out.print("Informe sua cidade: ");
      cidade = teclado.nextLine();
      System.out.print("Informe a UF: ");
      uf = teclado.nextLine();
      System.out.print("Informe seu CEP: ");
      cep = teclado.nextLine();
      System.out.print("Informe número do seu sapato: ");
      sapato = teclado.nextInt();
      System.out.print("Informe seu peso: ");
      peso = teclado.nextFloat();             
      System.out.println();
      System.out.println(nome);
      System.out.println(logradouro+", "+numero);
      System.out.println("Bairro "+bairro);
      System.out.println(cidade+" - "+uf);
      System.out.println();
      System.out.println("Peso (Kg): "+peso);
      System.out.println("Número do sapato: "+sapato);
      teclado.close();
   }
}