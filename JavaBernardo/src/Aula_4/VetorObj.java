package Aula_4;

public class VetorObj {
	
	private double x[], y[];
	
	public VetorObj(int tam){
		x = new double[tam];
		y = new double[tam];
		
		for (int i = 0; i < tam; i++) {
			setX(i);
			setY(i);
		}
	}
	
	public double getX(int i) {
		return x[i];
	}

	public double getY(int i) {
		return y[i];
	}
	public void setX(int i) {
		this.x[i] = Math.random();
	}

	public void setY(int i) {
		this.y[i] = Math.random();
		
	}
	
}
