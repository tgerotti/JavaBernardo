package Aula_1;

public class Telefone {
	private String numero;
	private String ddd;
	
	
	public String getNumero() {
		return numero;
	}
	
	public String getDdd() {
		return ddd;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public Telefone(String numero, String ddd) {
		this.numero = numero;
		this.ddd = ddd;
	}
	public Telefone() {
		this.numero = "";
		this.ddd = "";
	}

}
