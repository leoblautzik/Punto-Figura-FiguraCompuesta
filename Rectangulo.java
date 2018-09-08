package punto2D3DiPunto;

public class Rectangulo extends Figura {
	private double base;
	private double altura;


	public Rectangulo(String color,Punto origen,double base,double altura) {
		super(color,origen);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public double getArea() {
		return  base*altura;
	}

	@Override
	public String toString() {
		return "Rectangulo " + this.getColor();
	}


}
