package punto2D3DiPunto;

public class Circulo extends Figura {
	private double radio;

	public Circulo(String color,Punto origen,double radio) {
		super(color,origen);
		this.radio=radio;
	}

	@Override
	public double getArea() {
		return  Math.PI*Math.pow(this.radio,2);
	}

	@Override
	public String toString() {
		return "Circulo " + this.getColor()+" Radio:"+radio;
	}



}
