import java.util.Scanner; 
public class CalcQtdeMulheres2 {
   public static void main(String[] args) {
     int contador = 0;
     String nome, sexo;
     Scanner teclado = new Scanner(System.in);
     for (int aux=1; aux<=3; aux++) {
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("Sexo (M ou F): ");
        sexo = teclado.nextLine();
        if (sexo.equalsIgnoreCase("F") || 
        	sexo.equalsIgnoreCase("Feminino"))
          contador++;
     }
     System.out.print("Quantidade de mulheres = "+contador);
     teclado.close();
   }
}
