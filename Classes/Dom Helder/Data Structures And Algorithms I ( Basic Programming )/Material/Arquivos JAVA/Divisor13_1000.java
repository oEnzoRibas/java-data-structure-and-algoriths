public class Divisor13_1000 {
	public static void main(String[] args) {
      for (int divisor=1; divisor<=1000; divisor++)
        if (divisor % 13 == 0)
          System.out.print(divisor + " é divisor por 13");
   }
}
