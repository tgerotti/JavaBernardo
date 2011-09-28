package Aula_2;

import javax.swing.JOptionPane;

public class Variaveis {

	public static void main(String[] args) {
		
		String primeiro_numero;
		String segundo_numero;
		
		int soma;
		
		primeiro_numero = JOptionPane.showInputDialog("Entre com o primeiro numero");
		segundo_numero = JOptionPane.showInputDialog("Entre com o segundo numero");
		
		soma = Integer.parseInt(primeiro_numero) + Integer.parseInt(segundo_numero);
		
		JOptionPane.showMessageDialog(null, "A soma eh: " +soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		


	}

}
