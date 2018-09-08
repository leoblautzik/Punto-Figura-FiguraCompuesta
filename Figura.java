package punto2D3DiPunto;

public abstract class Figura {
	
	private String color;
	private Punto origen;
	
	public abstract double getArea();
	
	public String getColor() {
		return this.color;
	}
	public void desplazar(Object p) {
		this.origen.desplazamiento(p);
	}
	
	public Figura(String color, Punto origen) {
		this.color=color;
		this.origen=origen;
		
	}
	

}
