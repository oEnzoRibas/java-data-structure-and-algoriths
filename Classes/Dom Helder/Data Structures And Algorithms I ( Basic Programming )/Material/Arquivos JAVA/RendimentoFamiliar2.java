import java.util.Scanner; 
public class RendimentoFamiliar2 {
   public static void main(String[] args) {
     double rend, total = 0;
     String nome;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Para finalizar digite ZZZ no nome");           
     do {
       System.out.print("Informe o nome do aluno: ");
       nome = teclado.nextLine();
       if (nome.compareToIgnoreCase("ZZZ") != 0) {
          System.out.print("Informe o nome do aluno: ");
          rend = teclado.nextDouble();
          teclado.nextLine();
          total += rend;
       }
     } while (nome.compareToIgnoreCase("ZZZ") != 0); 
     System.out.println("Soma dos rendimentos = "+total);
   }
}


