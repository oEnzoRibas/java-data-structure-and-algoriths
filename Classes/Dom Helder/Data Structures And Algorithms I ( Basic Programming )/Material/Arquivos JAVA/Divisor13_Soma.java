public class Divisor13_Soma {
   public static void main(String[] args) {
     int soma = 0;
     for (int divisor=100; divisor<=500; divisor++)
        if (divisor % 13 == 0)
           soma += divisor;
     System.out.println("Soma dos divisíveis por 13 = "+soma);
   }
}

