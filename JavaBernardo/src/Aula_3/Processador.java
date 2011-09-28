package Aula_3;

public class Processador {
	
	private String marca, modelo;
	double velClock;
	int qtdCache, qtdBits;
	
	public String toString() {
		return "Processador Marca: "+ marca+", Modelo: "+modelo
				+"\nVersao bits:"+ qtdBits 
				+"\nCache:"+qtdCache
				+"\nClock="+velClock+"MGHz";
	}
	
	public Processador() {
		this.marca = "";
		this.modelo = "";
		this.velClock = 0.0;
		this.qtdCache = 0;
		this.qtdBits = 32;
	}
	
	public Processador(String marca, String modelo, double velClock,
			int qtdCache, int qtdBits) {
		this.marca = marca;
		this.modelo = modelo;
		this.velClock = velClock;
		this.qtdCache = qtdCache;
		this.qtdBits = qtdBits;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public double getVelClock() {
		return velClock;
	}


	public int getQtdCache() {
		return qtdCache;
	}


	public int getQtdBits() {
		return qtdBits;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setVelClock(double velClock) {
		this.velClock = velClock;
	}


	public void setQtdCache(int qtdCache) {
		this.qtdCache = qtdCache;
	}


	public void setQtdBits(int qtdBits) {
		this.qtdBits = qtdBits;
	}
	

}
