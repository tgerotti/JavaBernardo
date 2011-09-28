package Aula_7;

public class Pessoa {
	String nome, cpf, rg, telefone;

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pessoa(String nome, String cpf, String rg, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
	}
	public Pessoa() {
		this.nome = "";
		this.cpf = "";
		this.rg = "";
		this.telefone = "";
	}

	@Override
	public String toString() {
		return 	nome + 
				",\nRG: " + rg + ", CPF: " + cpf+
				"\nTelefone: " + telefone +".\n";
	}
	

}
