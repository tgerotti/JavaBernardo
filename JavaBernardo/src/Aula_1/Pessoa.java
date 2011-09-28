package Aula_1;

public class Pessoa {
	private String nome;
	private Telefone celular;
	
	public Pessoa() {
		this.nome = "";
		this.celular = new Telefone();
	}
	
	public Pessoa(String nome, String ddd, String numero) {
		this.nome = "";
		this.celular = new Telefone(ddd, numero);
	}
	
	public Pessoa(String nome, Telefone celular) {
		this.nome = nome;
		this.celular = celular;
	}
	
	public String getNome() {
		return nome;
	}
	public Telefone getCelular() {
		return celular;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCelular(Telefone celular) {
		this.celular = celular;
	}
	
	

}
