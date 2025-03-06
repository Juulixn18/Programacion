package ud7;

public class Personal extends Empleado2{
	
	private String seccion;
	public Personal(String nombre, String apellidos, String dni, String estado_civil, int añoIncorporacion,
			int nDespacho,String seccion) {
		super(nombre, apellidos, dni, estado_civil, añoIncorporacion, nDespacho);
		this.seccion=seccion;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String toString() {
		return super.toString()+"seccion=" + seccion;
	}
	
	
	


	
}