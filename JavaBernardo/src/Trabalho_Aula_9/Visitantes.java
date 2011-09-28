package Trabalho_Aula_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visitantes {

		private String nome, rg, origem, visitado;
		private Date data;
		private int codVisitante;
		
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
		
		
		public Visitantes() {
			this.nome = "";
			this.rg = "";
			this.origem = "";
			this.visitado = "";
		}
		
		public Visitantes(String nome, String rg, String origem,
				String visitado) {
			this.nome = nome;
			this.rg = rg;
			this.origem = origem;
			this.visitado = visitado;
		}
		public Visitantes(String nome, String rg, String origem,
				String visitado, Date data, int codVisitante) {
			this.nome = nome;
			this.rg = rg;
			this.origem = origem;
			this.visitado = visitado;
			this.data = data;
			this.codVisitante = codVisitante;
		}
		
		
		public String getNome() {
			return nome;
		}
		public String getRg() {
			return rg;
		}
		public String getOrigem() {
			return origem;
		}
		public String getVisitado() {
			return visitado;
		}
		public Date getData() {
			return data;
		}
		public int getCodVisitante() {
			return codVisitante;
		}

		public void setCodVisitante(int codVisitante) {
			this.codVisitante = codVisitante;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public void setVisitado(String visitado) {
			this.visitado = visitado;
		}
		public void setData(Date data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Nome: " + nome + ", RG " + rg 
			+ "\nUnidade de Origem: "+ origem
			+"\nData Visita: " + formatador.format(data)			
			+"\nVisitado: " + visitado;
		}


}
