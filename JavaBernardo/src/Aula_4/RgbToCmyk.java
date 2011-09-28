package Aula_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RgbToCmyk {

	public static void main(String[] args) {
		String resp = "N";
		DecimalFormat format = new DecimalFormat("#0.00000");// exibindo 5 casas após o ponto
		boolean continua;
		
		Scanner valor = new Scanner(System.in);
		Rgb rgb = new Rgb();
		Cmyk cmyk = new Cmyk();

		do {
			System.out.println("Entre com o valor de RED: ");
			rgb.setR(valor.nextInt());
			System.out.println("Entre com o valor de GREEN: ");
			rgb.setG(valor.nextInt());
			System.out.println("Entre com o valor de BLUE: ");
			rgb.setB(valor.nextInt());

			if (rgb.getR() < 0 || rgb.getR() > 255 || rgb.getG() < 0 || rgb.getG() > 255 || rgb.getB() < 0 || rgb.getB() > 255) {
				System.out.print("ERRO - digite valores entre 0 e 255.");// erro valores invalidos
			} else {
				
				cmyk = Cmyk.ConverteRgbCmyk(rgb);
			}
				
			System.out.println("\n - Cyan:    " + format.format(cmyk.getC())+ "\n - Yellow:  " 
				+ format.format(cmyk.getY()) + "\n - Magenta: "+ format.format(cmyk.getM()) + "\n - Black:   " + format.format(cmyk.getK()));
			System.out.println("Deseja converter outros valores? (S/N)");
			resp = valor.next();

			if (resp.toUpperCase().equals("S")) {
				continua = true;
			} else {
				continua = false;
			}
		} while (continua);
	}
}