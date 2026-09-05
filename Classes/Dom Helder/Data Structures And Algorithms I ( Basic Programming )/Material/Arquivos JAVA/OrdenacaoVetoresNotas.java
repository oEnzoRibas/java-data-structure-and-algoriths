import java.util.Scanner; 
public class OrdenacaoVetoresNotas {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);      
      double temp, nota1, nota2, nota3;
      double NOTAS[] = new double[10];
      for (int aux=0; aux<10; aux++) {
        System.out.print("Informe a nota 1:  ");
        nota1 = teclado.nextDouble();
        System.out.print("Informe a nota 2:  ");
        nota2 = teclado.nextDouble(); 
        System.out.print("Informe a nota 3:  ");
        nota3 = teclado.nextDouble();
        NOTAS[aux] = (nota1 + nota2 + nota3)/3;
      }
      for (int aux=0; aux<9; aux++)
        for (int x=0; x<9; x++)
          if (NOTAS[x]>NOTAS[x+1]) {
             temp = NOTAS[x];
             NOTAS[x] = NOTAS[x+1];
             NOTAS[x+1] = temp;
          }
      for (int aux=0; aux<10; aux++)
        System.out.println(NOTAS[aux]);
      teclado.close();
   }
}