package Aula_3;

public class Monitor {
	private String marca,  modelo;
	private int tamanho;
	
	@Override
	public String toString() {
		return "Monitor Marca:" + marca + ", modelo:" + modelo
		+ ", tamanho "+ tamanho + "\"\"";
	}
	public Monitor(String marca, String modelo, int tamanho) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	public Monitor() {
		this.marca = "";
		this.modelo = "";
		this.tamanho = 0;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
