package punto2D3DiPunto;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punto3D  extends Punto2D implements Punto{
    private Double z;
// constructores
	public Punto3D(double x,double y, double z){	
		super(x,y);
		this.z=z;
	}
	public Punto3D() {	
		super();
		this.z = 0.0;
	}
	public double distanciaAlOrigen(){	
		return sqrt( pow(getX(),2) + pow(getY(),2)+ pow(z,2) );
	}
//distancia
	public double distancia(Object obj){
		Punto3D p = (Punto3D) obj;
		return sqrt( pow(getX()-p.getX(),2) +  pow(getY()-p.getY(),2) + pow(z-p.z,2) );
	}

// desplazamiento
	public void desplazamiento(Object obj){
		Punto3D p = (Punto3D) obj;
		this.setX(this.getX()+p.getX());
		this.setY(this.getY()+p.getY());
		this.z+=p.z;
		return;		
	}	
	
// toString
	public String toString() 
	{	return super.toString() + " z= " + z ;
	}
	
// equals
	public boolean equals(Object obj) 
	{	if (this == obj)  return true;
		if (!super.equals(obj))          return false;
		if (getClass() != obj.getClass())return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z)) 
			return false;
		return true;
	}
// clone
	public Punto3D clone()
	{	return new Punto3D(getX(), getY(), z);
	}
// getters & setters
	public final double getZ() 
	{	return z;
	}
	public final void setZ(double z) 
	{	this.z = z;
	}

}