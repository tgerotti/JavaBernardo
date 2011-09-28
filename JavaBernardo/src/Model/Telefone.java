package Model;

public class Telefone {
	private String numero;
	private String ddd;
	private String operadora;
	
	public Telefone(){
		this.numero = "";
		this.ddd = "";
		this.operadora = "";
	}
	
	public Telefone(String numero, String ddd, String operadora){
		this.numero = numero;
		this.ddd = ddd;
		this.operadora = operadora;
	}
	
	//get set
	public String getNumero() {
		return numero;
	}
	public String getDdd() {
		return ddd;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

}
