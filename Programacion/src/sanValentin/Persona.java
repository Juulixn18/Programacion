package sanValentin;

public class Persona {

	private String nombre, dni;
	
	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
}
