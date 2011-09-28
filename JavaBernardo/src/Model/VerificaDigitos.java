package Model;

public class VerificaDigitos {
	
	public static String rg(String rg) {
		int soma = 0;
		int tamanho = rg.length();
		String dig;

		// split usando expressão regular
		// separa a string
		String digitos[] = rg.split("\\B");

		// despreza o digito se tiver
		if (tamanho > 8) {
			digitos[8] = "0";

		}

		for (int i = tamanho; i > 0; i--) {
			soma += Integer.parseInt(digitos[tamanho - i]) * (i + 1);
		}

		dig = Integer.toString(soma % 11);

		// dig = 10 retorna X
		// algumas instituições utilizam 0 ao invez de X
		if (dig.equals("10")) {
			dig = "X";
		}

		// formata o RG
		return digitos[0] + digitos[1] + "." + digitos[2] + digitos[3]
				+ digitos[4] + "." + digitos[5] + digitos[6] + digitos[7] + "-"
				+ dig;
	}

	public static String cpf(String cpf) {
		int cont = 0, soma = 0;
		int tamanho = cpf.length();
		String digitos[] = new String[11];// numero total a ser usado
		char digitosC[] = cpf.toCharArray();// separa os numeros

		// insere os numeros e prepara a entrada dos digitos
		for (int i = 0; i <= 8; i++) {
			digitos[i] = String.valueOf(digitosC[i]);
		}

		do {
			for (int i = tamanho; i > 0; i--) {
				soma += Integer.parseInt(digitos[tamanho - i]) * (i + 1);
			}

			digitos[tamanho] = Integer.toString((soma * 10) % 11);
			if (digitos[tamanho].equals("10")) {
				digitos[tamanho] = "0";
			}
			tamanho++;
			cont++;
			soma = 0;

		} while (cont <= 1);

		// retorna CPF formatado
		return digitos[0] + digitos[1] + digitos[2] + "." + digitos[3]
				+ digitos[4] + digitos[5] + "." + digitos[6] + digitos[7]
				+ digitos[8] + "-" + digitos[9] + digitos[10];
	}

}
