package Aula_3;

public class Computador {
	private Processador processador;
	private Hdd hdd;
	private Motherboard motherboard;
	private Monitor monitor;
	
	public Computador(Processador processador, Hdd hdd,
			Motherboard motherboard, Monitor monitor) {
		this.processador = processador;
		this.hdd = hdd;
		this.motherboard = motherboard;
		this.monitor = monitor;
	}
	
	public Computador() {
		this.processador = new Processador();
		this.hdd = new Hdd();
		this.motherboard = new Motherboard();
		this.monitor = new Monitor();
	}
	
	@Override
	public String toString() {
		return "Computador HDD:" + hdd + ", monitor:" + monitor
				+ ", motherboard, " + motherboard 
				+ ", processador: "	+ processador + ".";
	}

	public Processador getProcessador() {
		return processador;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
}
