import java.util.Scanner; 
public class NavioProduto {
   public static void main(String[] args) {
      int produtos, sobra, caixas, containers, navios;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Informe quantidade de produtos produzidos : ");
      produtos = teclado.nextInt();
      caixas = produtos / 20;
      sobra = produtos % 20;
      containers = caixas / 80;
      navios = containers / 150;
      System.out.println("Caixas lacradas = "+caixas);
      System.out.println("Caminhões despachados = "+containers);
      System.out.println("Navios que partiram = "+navios);
      System.out.println("Produtos que sobraram = "+sobra);       
      teclado.close();
   }
}
