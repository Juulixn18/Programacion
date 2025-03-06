package ud7;

public class Empleado2 extends Persona {
	public Empleado2(String nombre, String apellidos, String dni, String estado_civil) {
		super(nombre, apellidos, dni, estado_civil);
		// TODO Auto-generated constructor stub
	}

	private int añoIncorporacion, nDespacho;
	public Empleado2(String nombre, String apellidos, 
			String dni, String estado_civil,int añoIncorporacion, 
			int nDespacho) {
		super(nombre, apellidos, dni, estado_civil);
		   this.añoIncorporacion=añoIncorporacion;
		   this.nDespacho=nDespacho;
	}
	//getters
	public int getAñoIncorporacion() {
		return añoIncorporacion;
	}
	public int getnDespacho() {
		return nDespacho;
	}
	//setters
	public void setAñoIncorporacion(int añoIncorporacion) {
		this.añoIncorporacion = añoIncorporacion;
	}
	public void setnDespacho(int nDespacho) {
		this.nDespacho = nDespacho;
	}

	public String toString() {
		return super.toString()+ "AñoIncorporacion=" + añoIncorporacion + ", nDespacho=" + nDespacho ;
	}
	
	
	

}
