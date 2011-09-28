package Aula_5;

public class RegistroAgenda {
	
	private String nome, endereco, telefone, email;
	
	public RegistroAgenda(String nome, String endereco, String telefone,
			String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	public RegistroAgenda() {
		this.nome = "";
		this.endereco = "";
		this.telefone = "";
		this.email = "";
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", endereco: " + endereco
				+ ", telefone: " + telefone + ", email: " + email;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
