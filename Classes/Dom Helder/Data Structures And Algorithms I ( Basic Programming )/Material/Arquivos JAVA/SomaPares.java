public class SomaPares {
	public static void main(String[] args) {
      int soma = 0;
      for (int aux=1000; aux<=2000; aux++)
        if (aux % 2 != 0)
           soma += aux;
      System.out.print("A soma deu " + soma);
   }
}
