package ud7;

public class Profesores extends Empleado2 {

	private String departamento;
	public Profesores(String nombre, String apellidos, String dni, String estado_civil, int añoIncorporacion,
			int nDespacho, String departamento) {
		//El super llama al constructor de la clase padre
		
		super(nombre, apellidos, dni, estado_civil, añoIncorporacion, nDespacho);
		this.departamento=departamento;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return super.toString()+"Departamento=" + departamento;
	}
	

}
