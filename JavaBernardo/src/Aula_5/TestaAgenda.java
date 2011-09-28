package Aula_5;

import java.util.ArrayList;

public class TestaAgenda {
	
	public static void main(String arg[]){
		
		ArrayList ag = new ArrayList();
		Agenda ag01 = new Agenda ("nome", "endereco", "telefone", "email", "tipoRegistro");
		Agenda ag02 = new Agenda ();
		
		ag.add(ag01);
		ag.add(ag02);
		
		ag01.imprimeRegistros(ag);
		
	}

}
