package Model;

public class Prontuario {
	private String numero;
	private String tipo;
	
	
	public Prontuario() {
		this.numero = "";
		this.tipo = "";
	}
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Prontuario(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	

}
