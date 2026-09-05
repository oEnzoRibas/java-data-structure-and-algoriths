public class SomaParesPasso {
	public static void main(String[] args) {
      int soma = 0;
      for (int aux=1001; aux<=2000; aux+=2)
        soma += aux;
      System.out.print("A soma deu " + soma);
   }
}
