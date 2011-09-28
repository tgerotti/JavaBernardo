package Aula_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VetoresObj {

	public static void main(String[] args) {
		int i, n;
		double soma, mult, somaT;
		Scanner qtd = new Scanner(System.in);
		DecimalFormat nf = new DecimalFormat("#0.00");
		
		System.out.println("Entre com o tamanho do vetor: ");
		n = qtd.nextInt();
		if (n <= 0) {
			n = 1;
		}
		VetorObj vetorXY = new VetorObj(n);
		somaT = 0;

		System.out.println("Indice--Vetorx--VetorY-- soma --Multiplicacao--total");

		for (i = 0; i < n; i++) {
			somaT += (vetorXY.getX(i) + vetorXY.getY(i)); // acumula o total
			soma = vetorXY.getX(i) + vetorXY.getY(i);// facilita exibicao
			mult = vetorXY.getX(i) * vetorXY.getY(i);// facilita exibicao

			System.out.println("- " + (i + 1) + "   -- " + nf.format(vetorXY.getX(i))
					+ " -- " + nf.format(vetorXY.getY(i)) + " -- " + nf.format(soma)
					+ " --   " + nf.format(mult) + "      -- "
					+ nf.format(somaT));
		}
	}
}
