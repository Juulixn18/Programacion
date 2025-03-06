package POAO;

import java.util.Random;

public class Persona {
	// Constantes
	public final int SOBREPESO = 1;
	public final int PESOIDEAL = 0;
	public final int PESOBAJO = -1;

	// ATRIBUTOS
	private String dni, nombre;
	private int edad;
	private char sexo;
	private double peso, altura;

	// Constructores
	public Persona(String dni, String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		generaDni();
		this.peso = 0;
		this.altura = 0;
	}

	public Persona() {
		nombre = "";
		generaDni();
		edad = 0;
		sexo = 'H';
		altura = 0;
		edad = 0;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		if (sexo != 'H' && sexo != 'M') {
			sexo = 'H';
		}
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// getters
	public String getNombre() {
		return nombre;
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

	public String getDni() {
		return dni;
	}

	public void generaDni() {
		Random random = new Random();
		String dni="";
		for (int i = 0; i < 8; i++) {
			int numAle = random.nextInt(10);
			dni+=numAle;
		}
		int dniEnEnetero=Integer.parseInt(dni);
		int resto=dniEnEnetero%23;
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		dni+=letras.charAt(resto);
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public int calculaIMC() {
		double imc = peso / (altura * altura);
		if (imc < 20)
			return -1;
		if (imc > 25)
			return 1;

		return 0;
	}

	public boolean esMayorDeEdad() {
		return (edad >= 18) ? true : false;

	}

}
