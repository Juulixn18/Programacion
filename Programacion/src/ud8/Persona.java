package ud8;

public class Persona {
	private String nombre, edad, sexo;
	
	public Persona(String nombre, String edad, String sexo) {
		this.edad=edad;
		this.sexo=sexo;
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
}
