package punto2D3DiPunto;

public class Triangulo extends Figura {
	private double base;
	private double altura;


	public Triangulo(String color,Punto origen,double base,double altura) {
		super(color,origen);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public double getArea() {
		return  base*altura/2;
	}

	@Override
	public String toString() {
		return "Triangulo " + this.getColor();
	}


}
