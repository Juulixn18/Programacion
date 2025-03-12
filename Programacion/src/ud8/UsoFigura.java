package ud8;

public class UsoFigura {
	public static void main(String[] args) {
		Figura[] figuras=new Figura[3];
		
		//figuras[0]=new Circulo("circu1",new Punto("centro1",0,0),2);
		figuras[0]=new Punto("punto2", 1, 0);
		figuras[1]=new Punto("punto1",1,0);
		figuras[2]=new Cilindro("cilindro1",(Circulo)figuras[0],5);
		
		for (int i=0; i<3; i++) {
			System.out.println("nombre:"+figuras[i].getNombre().toUpperCase());
			System.out.println("Área:"+figuras[i].obtenerArea());
			System.out.println("Volumen:"+figuras[i].obtenerVolumen());
		}
		
		System.out.println(figuras[1].equals(figuras));
	}
}