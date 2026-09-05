public class ExemplosMetodosStrings {
 public static void main(String[] args) {
   String texto = "Ricardo Luiz de Freitas", texto2;
   System.out.println("Quantidade de caracteres = "+texto.length());
   // 23 
   System.out.println("Pegar Luiz no texto = "+texto.substring(8,12));
   // "Luiz"
   System.out.println("Posição de 'Luiz' = "+texto.indexOf("Luiz"));
   // 9
   System.out.println("Tudo maiúsculo = "+texto.toUpperCase());
   // "RICARDO LUIZ DE FREITAS"
   System.out.println("Tudo minúsculo = "+ texto.toLowerCase());	
   // "ricardo luiz de Freitas"
   System.out.println(texto.substring(9,14));
   // "uiz d"
   System.out.println(texto.substring(13,19));
   // "de Fre"
   texto2 = "Dr. " + texto + " Filho";
   System.out.println(texto2);
   // "Dr. Ricardo Luiz de Freitas Filho"
 } 
}
