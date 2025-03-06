package POAO;

public class Coche {
	//atributos
	private int num_ruedas, num_puertas;
	private String color, motor, matricula;
	private double peso;
	//metodos constructores: inicializa el objeto cuando se crea
	public Coche(){
		num_ruedas=4;
		num_puertas=5;
		color="rojo";
		motor="v8";
		matricula="abc55";
		peso=1000;
	}
	//metodos
	public void arrancar() {
		System.out.println("Arrancando coche con matricula "+matricula);
	}
	public void acelerar() {
		System.out.println("Estas acelerando!!!");
		System.out.println(num_puertas);
		System.out.println(motor);
		System.out.println(peso);
	}
	
	//metodos getters
	public int dameNumRuedas () {
		return num_ruedas;
	}
	public String dameColor() {
		return color;
		
	}
	//metodo setters
	public void cambiaColor(String nuevoColor) {
		// cambiamos el valor del atributo "color" al nuevo valor
		// que le pasamos por parametro
		color=nuevoColor;
	}
}
