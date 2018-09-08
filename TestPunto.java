package punto2D3DiPunto;

public class TestPunto{
	public static void main(String[] args) {

		Punto2D p2 = new Punto2D(4,9);
		Punto3D p3 = new Punto3D(1,4,-2);
		System.out.println(p2+ " "+p2.getClass());
		System.out.println(p3+ " "+p3.getClass());
		//p3 = p2;
		//p2 = p3;
		System.out.println(p2+ " "+p2.getClass());

		Punto p4 = new Punto2D(2,6);

		Punto p5 = new Punto3D(-1,3,6.5);

		Punto[]puntoVec=new Punto[5];
		puntoVec[0]=p2;
		puntoVec[1]=p3;
		puntoVec[2]=p4;
		puntoVec[3]=p5;
		puntoVec[4]=p2;

		for(Punto cadaPunto:puntoVec)
			System.out.println(cadaPunto.toString());




	}

}