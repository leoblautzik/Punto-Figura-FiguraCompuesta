package punto2D3DiPunto;

import java.util.ArrayList;

public class FiguraCompuesta extends Figura {
	
	private ArrayList<Figura> figuras;
	
	public FiguraCompuesta(String color,Punto origen) {
		super(color,origen);
		this.figuras=new ArrayList<Figura>();		
	}

	public void agregarFigura(Figura f) {
		this.figuras.add(f);
	}
	@Override
	public double getArea() {
		double area=0;
		for(Figura f:this.figuras)
			area+=f.getArea();
		return area;
	}

}
