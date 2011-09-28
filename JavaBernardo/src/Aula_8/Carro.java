package Aula_8;

public class Carro {

	String datacreate;
	String marca;
	String modelo;
	String cor;
	int ano;
	int codcarro;
	
	public Carro(){
		this.datacreate = "";
		this.marca = "";
		this.modelo = "";
		this.cor = "";
		this.ano = 0;
		this.codcarro = 0;
	}
	
	public Carro( String datacreate, String marca, String modelo, String cor, int ano ){
		this.datacreate = datacreate;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;		
	}
	public Carro( String datacreate, String marca, String modelo, String cor, int ano, int codcarro ){
		this.datacreate = datacreate;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;	
		this.codcarro = codcarro;
	}

	public String getDatacreate() {
		return datacreate;
	}
	public void setDatacreate(String datacreate) {
		this.datacreate = datacreate;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCodcarro() {
		return codcarro;
	}
	public void setCodcarro(int codcarro){
		this.codcarro = codcarro;
	}
	
	public String toString(){
		return "Modelo: " + this.modelo + ", marca: " + this.marca + ", cor: " + this.cor + ", ano: " + this.ano;
	}
	
}
