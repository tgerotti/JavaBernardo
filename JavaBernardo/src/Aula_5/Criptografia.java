package Aula_5;

public class Criptografia {
	
	private String dadosCript, dadosDecript;
	
	public Criptografia(String dado) {
		
		this.dadosCript = cript(dado);
		this.dadosDecript = decript(this.dadosCript);
	}
	
	public Criptografia() {
		
		this.dadosCript = "";
		this.dadosDecript = "";
	}
	
	public static String cript(String dado){
		///ASCII 0 a 255
		String ret = "";
		int simbolos[] = new int[dado.length()];
		char letras[] =  dado.toCharArray();
		
		for(int i =0; i < dado.length(); i++ ){
			simbolos[i] = (int)letras[i] + 2;
			
		}
				
		for(int i =0; i < dado.length(); i++ ){
			
			if ((int)letras[i] + 2 > 255){
				if ((int)letras[i] + 2 == 256){
					simbolos[i] = (int) 0;
				}else{
					simbolos[i] = (int) 1;
				}
			}else{
				simbolos[i] = (int)letras[i] + 2;
			}
			
		}
		
		for(int i =0; i < dado.length(); i++ ){
			
			ret += (char)simbolos[i];
		}
				
		return ret;
	}

	public static String decript(String dado){
		///ASCII 0 a 255
		String ret = ""; 
		int simbolos[] = new int[dado.length()];
		char letras[] =  dado.toCharArray();
				
		for(int i =0; i < dado.length(); i++ ){
			simbolos[i] = (int)letras[i] - 2;
			
		}
		
		for(int i =0; i < dado.length(); i++ ){
			if ((int)letras[i] - 2 < 0){
				if((int)letras[i] - 2 == -1){
					letras[i] = (char) 255;	
				}else{
					letras[i] = (char) 254;	
				}
			}else{
			
				simbolos[i] = (int)letras[i] - 2;
			
			}
			
		}
		
		for(int i =0; i < dado.length(); i++ ){
			
			ret += (char)simbolos[i] + "";
		}
				
		return ret;
	}

	public String getDadosCript() {
		return dadosCript;
	}

	public String getDadosDecript() {
		return dadosDecript;
	}

	public void setDadosCript(String dados) {
		this.dadosCript = cript(dados);
	}

	public void setDadosDecript(String dados) {
		this.dadosDecript = decript(dados);
	}

}
