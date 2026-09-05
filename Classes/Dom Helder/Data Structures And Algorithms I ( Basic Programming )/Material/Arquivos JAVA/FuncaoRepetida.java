import java.util.Scanner; 
public class FuncaoRepetida {
   public static void main(String[] args) {
     double x, fx;     
     Scanner teclado = new Scanner(System.in);
     for (int repeticao=1; repeticao<=10; repeticao++) {
        System.out.print("Entre com o valor de x: ");
        x = teclado.nextDouble();
        fx = Math.pow(x,2) - 1;
        System.out.println("x = "+x+" f(x) = "+fx);
     }
     teclado.close();
   }
}
