package POAO;

public class Rectangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;

	//constructor
	public Rectangulo(double bas, double alt) {
		base=bas;
		altura=alt;
	}
	
	//getters
	public double dameBase() {
		return base;
	}
	public double damealtura() {
		return altura;
	}
	public double dameperimetro() {
		return perimetro;
	}
	public double area() {
		return area;
	}
	
	//setters
	public void nuevaBase(double nuevaBase) {
		base=nuevaBase;
	}
	public void nuevaAltura(double nuevaAltura) {
		base=nuevaAltura;
	}
	public void nuevaArea(double nuevaArea) {
		area=base*altura;
	}
	public void nuevoPerimetro(double nuevoPerimetro) {
		perimetro=base*2+altura*2;
	}

	
	
	
}
