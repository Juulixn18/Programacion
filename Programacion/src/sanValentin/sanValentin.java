package sanValentin;

public class sanValentin {

	public static void main(String[] args) {
		Persona p1=new Persona("123a","Persona1");
		Persona p2=new Persona("123b","Persona2");

		Pareja pareja=new Pareja(p1,p2);
		//pasamos por parametro un objeto anonimo
		pareja.setRegaloParaP1(new Regalo("Regalo","",10));
		
		System.out.println(pareja.calcularCostoTotal());
		System.out.println(pareja.toString());
	}

}
