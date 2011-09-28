package Aula_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		int i, n;
		double x[], y[], soma, mult, somaT;
		Scanner qtd = new Scanner(System.in);
		DecimalFormat nf = new DecimalFormat("#0.00");
		
		System.out.println("Entre com o tamanho do vetor: ");
		n = qtd.nextInt();
		if (n <= 0) {
			n = 1;
		}
		x = new double[n];
		y = new double[n];
		somaT = 0;

		for (i = 0; i < n; i++) {
			x[i] = Math.random();
			y[i] = Math.random();
		}

		System.out.println("Indice--Vetorx--VetorY-- soma --Multiplicacao--total");

		for (i = 0; i < n; i++) {
			somaT += (x[i] + y[i]); // acumula o total
			soma = x[i] + y[i];// facilita exibicao
			mult = x[i] * y[i];// facilita exibicao

			System.out.println("- " + (i + 1) + "   -- " + nf.format(x[i])
					+ " -- " + nf.format(y[i]) + " -- " + nf.format(soma)
					+ " --   " + nf.format(mult) + "      -- "
					+ nf.format(somaT));
		}
	}
}
