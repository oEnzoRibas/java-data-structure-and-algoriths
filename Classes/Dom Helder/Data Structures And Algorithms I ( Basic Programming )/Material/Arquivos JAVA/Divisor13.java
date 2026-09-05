public class Divisor13 {
   public static void main(String[] args) {
      for (int divisor=100; divisor<=500; divisor++)
        if (divisor % 13 == 0)
           System.out.println(divisor+" é divisível por 13");
   }
}
