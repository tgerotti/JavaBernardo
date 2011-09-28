package Aula_3;

public class Motherboard {
	private String marca, modelo;
	private int qtdMemoria;
	private boolean placaSom, placaVideo;
	
	public String toString() {
		return "Motherboard Marca: " + marca + ", modelo:" + modelo
				+ "\nSom on Board: " + placaSom + ", Video on Board: " + placaVideo
				+ ", memoria suportada" + qtdMemoria + "Gb.";
	}

	public Motherboard(String marca, String modelo, int qtdMemoria,
			boolean placaSom, boolean placaVideo) {
		this.marca = marca;
		this.modelo = modelo;
		this.qtdMemoria = qtdMemoria;
		this.placaSom = placaSom;
		this.placaVideo = placaVideo;
	}
	
	public Motherboard() {
		this.marca = "";
		this.modelo = "";
		this.qtdMemoria = 0;
		this.placaSom = false;
		this.placaVideo = false;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getQtdMemoria() {
		return qtdMemoria;
	}

	public boolean isPlacaSom() {
		return placaSom;
	}

	public boolean isPlacaVideo() {
		return placaVideo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setQtdMemoria(int qtdMemoria) {
		this.qtdMemoria = qtdMemoria;
	}

	public void setPlacaSom(boolean placaSom) {
		this.placaSom = placaSom;
	}

	public void setPlacaVideo(boolean placaVideo) {
		this.placaVideo = placaVideo;
	}
	
	
	
	

}
