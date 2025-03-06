package RepasoExamen;

public class Persona {
	private String nombre,  dni;
	private int edad;
	private char sexo;
	private double peso, altura;
	public Persona(String nombre, String dni, int edad,
				   char sexo, double peso,double altura) {
		this.nombre=nombre;
		this.altura=altura;
		this.dni=dni;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setSexo(char sexo) {
		if (sexo=='H'||sexo=='M')
		this.sexo=sexo;
		else
			System.out.println("Introduzca si es hombre o mujer");
	}
	public void setPeso(double peso) {
		this.peso=peso;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getdni() {
		return dni;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public String toString () {
		return "Nombre: "+nombre+" dni:"+dni+" peso: "+peso+" altura: "+altura
				+" Sexo: "+sexo;
	}
}
