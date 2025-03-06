package ud7;

public class Persona {
	

	private String nombre, apellidos, dni, estado_civil;
	public Persona(String nombre, String apellidos, String dni, String estado_civil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.estado_civil = estado_civil;
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDni() {
		return dni;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String toString() {
		return "Persona:" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", estado_civil="
				+ estado_civil + "";
	}
	
	
}
