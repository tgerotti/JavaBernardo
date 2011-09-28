package Aula_4;

public class Cmyk {
	private double c , m , y , k ;
	
	public Cmyk(){
		double c = 0.0, m = 0.0, y = 0.0, k = 0.0;
	}
	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getK() {
		return k;
	}

	public void setK(double k) {
		this.k = k;
	}
	
	public static Cmyk ConverteRgbCmyk(Rgb rgb){
		
		double w = 0.0;
		Cmyk cmyk = new Cmyk();
		
		if (rgb.getR() == 0 && rgb.getG() == 0 && rgb.getB() == 0) {	// cor = preta
			cmyk.setC(0.0);
			cmyk.setM(0.0);
			cmyk.setY(0.0);
			cmyk.setK(1.0);
		} else {
			if (rgb.getR() == 255 && rgb.getG() == 255 && rgb.getB() == 255) {// cor = branca						
				cmyk.setC(0.0);
				cmyk.setM(0.0);
				cmyk.setY(0.0);
				cmyk.setK(0.0);
			} else {// formula, nao esquecer o d(que indica double)						
				w = Math.max(rgb.getR() / 255d, rgb.getG() / 255d);
				w = Math.max(w, rgb.getB() / 255d);
				
				cmyk.setC ((w - rgb.getR() / 255d) / w);
				cmyk.setM ((w - rgb.getG() / 255d) / w);
				cmyk.setY ((w - rgb.getB() / 255d) / w);
				cmyk.setK (1 - w);
			}
		}
		return cmyk;
	}

}
