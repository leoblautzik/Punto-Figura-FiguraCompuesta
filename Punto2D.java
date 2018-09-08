package punto2D3DiPunto;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punto2D implements Punto{	
	private Double x;
	private Double y;
	// constructores	
	public Punto2D(double x, double y){   
		setX(x);
		setY(y);
	}
	public Punto2D()
	{	this (0,0) ;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public void setY(Double y) {
		this.y = y;
	}
	// distancia y modulo
	public double distancia(Object obj){
		Punto2D p = (Punto2D) obj;
		return sqrt( pow(x-p.x,2) +  pow(y-p.y,2) );
	}
	public double distanciaAlOrigen(){
		return sqrt( pow(x,2) +  pow(y,2) );
	}
	// desplazamiento
	public void desplazamiento(Object obj){
		Punto2D p = (Punto2D) obj;
		this.x+=p.x;
		this.y+=p.y;
		return;
	}
	// toString
	public String toString(){
		return "x= " + x + " y= " + y ;
	}
	// equals
	public boolean equals(Object obj){ 
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass() != obj.getClass()) return false;
	Punto2D otro = (Punto2D) obj;
	if (Double.doubleToLongBits(y) != Double
			.doubleToLongBits(otro.y)) return false;
	if (Double.doubleToLongBits(x) != Double
			.doubleToLongBits(otro.x)) return false;
	return true;
	}
	// clone
	public Punto2D clone(){	
		return new Punto2D(x, y);
	}
	// getters & setters
	protected  double getX(){	
		return x;
	}
	protected final void setX(double x)	{
		this.x = x;
	}
	protected final double getY(){
		return y;
	}
	protected final void setY(double y){ 
		this.y = y;
	}

}