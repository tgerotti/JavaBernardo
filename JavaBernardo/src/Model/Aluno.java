package Model;

import java.util.Date;

public class Aluno {
	private String nome;
	private Date dtNascimento;
	private Telefone telefone;
	private Prontuario prontuario;
	
	
	public Aluno(){
		this.nome = "";
		this.dtNascimento = new Date();
		this.telefone = new Telefone();
		this.prontuario = new Prontuario();
		
	}

	public Aluno(String nome, Date dtNascimento, Telefone telefone, Prontuario prontuario) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.prontuario = prontuario;
	}
	
	public Aluno(String nome, Date dtNascimento, Telefone telefone,	String numero, String tipo) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.prontuario = new Prontuario(numero, tipo);
	}
	
	//get e set
	
	public String getNome() {
		return nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}

}
