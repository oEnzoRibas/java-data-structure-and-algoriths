
public class StringVetor3 {

	public static void main(String[] args) {
	      String frase = "ADORO O GALÃO DA MASSA";
	      String letras[] = frase.split("");
	      for (int aux=0; aux<letras.length; aux++)
	         System.out.println(letras[aux]);
//	      for (String aux : frase)
//	         System.out.println(aux);
	}
}
