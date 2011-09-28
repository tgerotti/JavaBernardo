package Aula_5;

import java.util.ArrayList;

public class Agenda {
	
	private RegistroAgenda dadosPessoa;
	private String tipoRegistro;
		
	public Agenda() {
		this.dadosPessoa = new RegistroAgenda();
		this.tipoRegistro = "";	
	}
	public Agenda(String nome, String endereco, String telefone, String email, String tipoRegistro) {
		this.dadosPessoa = new RegistroAgenda(nome, endereco, telefone, email);
		this.tipoRegistro = "";
	}
	
	@Override
	public String toString() {
		return "Agenda, "+tipoRegistro+" - "+ dadosPessoa+"\n";
	}
	public void imprimeRegistros(ArrayList agendaReg){
		
		for(int i = 0; i < agendaReg.size(); i++){
		if( agendaReg != null)
			System.out.println(agendaReg);
		}
	}
	
	public void addRegistro(Agenda agendaReg, ArrayList local){
		local.add(agendaReg);
	}
	
	public void delRegistro(Agenda agendaReg){
		agendaReg.setDadosPessoa(null);
		agendaReg.setTipoRegistro(null);
	}
	
	
	
	
	public RegistroAgenda getDadosPessoa() {
		return dadosPessoa;
	}
	public String getTipoRegistro() {
		return tipoRegistro;
	}
	public void setDadosPessoa(RegistroAgenda dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}
	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	
	

}
