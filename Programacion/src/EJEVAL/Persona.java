package EJEVAL;

public class Persona {
	private String dni;
	private String nombrePersona;
	public Persona(String dni, String nombrePersona) {
		this.dni=dni;
		this.nombrePersona=nombrePersona;
	}
	public String getDni() {
		return dni;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public String toString() {
		return "Persona dni=" + dni + ", nombrePersona=" + nombrePersona + "";
	}
	
}
