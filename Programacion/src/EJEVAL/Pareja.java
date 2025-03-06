package EJEVAL;

public class Pareja {	
	Persona persona1=new Persona("019290A","Alba");
	Persona persona2=new Persona("468478J","Juan");
	Regalo regalo1=new Regalo("movil",1000,"samsung");
	Regalo regalo2=new Regalo("libro",80,"la tregua ");
	public Pareja(String dni, String nombre) {
		dni="";
		nombre="";
	}
	public Regalo setRegaloParaPersona1(Regalo regalo){
		 return regalo1=regalo;
	}
	public Regalo setRegaloParaPersona2(Regalo regalo){
		return regalo2=regalo;
	}
	public double calcularCostoTotal() {
		double total = regalo1.getPrecioRegalo()+regalo2.getPrecioRegalo();
		return total;
	}
	public void mostrarDetalles() {
		System.out.println("Persona1:");
		System.out.println(regalo1.getNombreRegalo());
		System.out.println(regalo1.getPrecioRegalo());
		System.out.println(regalo1.getDescripcionRegalo());
		System.out.println("Persona2:");
		System.out.println(regalo2.getNombreRegalo());
		System.out.println(regalo2.getPrecioRegalo());
		System.out.println(regalo2.getDescripcionRegalo());
		System.out.println("Total: "+calcularCostoTotal());
	}
	@Override
	public String toString() {
		return "Pareja: p1"+ persona1 + ", p2:" + persona2 + "\nr1=" + regalo1 + "\nr2:" + regalo2 + " \n"+" Total "+calcularCostoTotal();
	}
	
}
