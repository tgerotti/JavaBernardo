package Aula_3;

public class Hdd {
	private String marca, modelo;
	private double tamanho;
	
	@Override
	public String toString() {
		return "Hdd Marca: " + marca + ", modelo:" + modelo
		+ ", tamanho "+ tamanho + "Gb.";
	}

	public Hdd(String marca, String modelo, double tamanho) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	public Hdd() {
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

	public double getTamanho() {
		return tamanho;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	

}
