package sanValentin;

public class Pareja {
	private Persona p1, p2;
	private Regalo regaloParaP1, regaloParaP2;
	public Pareja(Persona p1, Persona p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		regaloParaP1=new Regalo("","",0);
		regaloParaP2=new Regalo("","",0);
	}
	public void setRegaloParaP1(Regalo regaloParaP1) {
		this.regaloParaP1 = regaloParaP1;
	}
	public void setRegaloParaP2(Regalo regaloParaP2) {
		this.regaloParaP2 = regaloParaP2;
	}
	public double calcularCostoTotal() {
		return regaloParaP1.getPrecio()+regaloParaP2.getPrecio();
	}
	public void mostrarDetalles() {
		System.out.println("Regalo para persona1"+regaloParaP1.toString());
		System.out.println("Regalo para persona2"+regaloParaP2.toString());
	}
	public String toString() {
		return "p1:"+p1.toString()+" p2:"+p2.toString()+ " Regalo para persona 1"
		+regaloParaP1.toString()+" Regalo para persona 2"+regaloParaP2.toString();
	}
	
}
