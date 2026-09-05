import java.util.Scanner; 
public class CalculaINSS {
   public static void main(String[] args) {
     double salario, inss;
     Scanner teclado = new Scanner(System.in);
     System.out.print("Informe o valor do seu salário: ");
     salario = teclado.nextDouble();
     inss = salario * 8 / 100;
     System.out.println("O valor do INSS = "+inss);
     teclado.close();
   }
}
