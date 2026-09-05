import java.text.DecimalFormat;

public class FormatandoNumeros1 {
	public static void main(String[] args) {
		double valor = 12005.867;
		String valorFormatado;
		valorFormatado = new DecimalFormat("#,##0.00").format(valor);
		System.out.println(valorFormatado);
		// Imprimirá: 12.005,87
		valorFormatado = new DecimalFormat("R$ #,##0.00").format(valor);
		System.out.println(valorFormatado);
		// Imprimirá: R$ 12.005,87
		valorFormatado = new DecimalFormat("#,##0").format(valor);
		System.out.println(valorFormatado);
		// Imprimirá: 12.006
	}
}
