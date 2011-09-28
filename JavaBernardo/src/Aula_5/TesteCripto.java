package Aula_5;

import java.util.Scanner;

public class TesteCripto {
	
	public static void main(String args[]) {
		
		Scanner entra = new Scanner(System.in);
		String dado;
		
		System.out.println("Entre com a mensagem!");
		dado = entra.nextLine();
		
		System.out.println("A msg: "+ dado + 
				"\nmsg Criptografada: " + Criptografia.cript(dado)+
				"\nmsg Descriptografado: " + Criptografia.decript(Criptografia.cript(dado)));
		
		Criptografia msg = new Criptografia(dado);
		
		System.out.println("A menssagem            : " + dado + 
						"\nmsg Criptografada   : " + msg.getDadosCript()+
						"\nmsg Descriptografado: " + msg.getDadosDecript());
		
		System.out.println(Criptografia.cript(dado)+"\n");
		System.out.println(Criptografia.decript(Criptografia.cript(dado))+"\n");
		
	}

}
