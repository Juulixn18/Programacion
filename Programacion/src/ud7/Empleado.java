package ud7;

public class Empleado {
	private String nombre, apellido, nSS;

	private double salarioBase;
	public Empleado(String nombre, String apellido, String nSS, double salarioBase) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nSS=nSS;
		this.salarioBase=salarioBase;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setnSS(String nSS) {
		this.nSS = nSS;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getnSS() {
		return nSS;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public double calculaSalario() {
		return salarioBase;
	}
	
}
