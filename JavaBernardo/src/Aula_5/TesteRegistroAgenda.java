package Aula_5;


public class TesteRegistroAgenda {
	
	public static void main(String args[]){
		
		RegistroAgenda[] reg = new RegistroAgenda[3];
		
		reg[0] = new RegistroAgenda("Carlos","Av.01, 365","3652-4845","carlos@uol.com.br");
		
		reg[1] = new RegistroAgenda();
		
		reg[2] = new RegistroAgenda("Anotnio","Rua do cafe, 125","(11)8592-4445","tonho@gmail.com");
		
		for(RegistroAgenda e: reg ){
			
			System.out.println(e);
		}
		
	}

}
