package ud8;

public abstract class Figura {
	private String nombre;
	
	public Figura(String n) {
		nombre=n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract double obtenerArea();
	
	public abstract double obtenerVolumen();
	

}