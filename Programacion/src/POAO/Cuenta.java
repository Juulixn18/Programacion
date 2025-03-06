package POAO;

public class Cuenta {
	//atributos
	private String titular;
	private double cantidad;
	
	//metodos constructories inicializados
	//al haber varios se le lama sobrecarga de metodos.
	public Cuenta(String tit) {
		titular = tit;
		cantidad=0;
	}
	public Cuenta(String tit, double cantInicial) {
		titular = "Julian";
		cantidad = cantInicial;
	}
	//metodos
	public void Titular() {
		System.out.println("Titular: "+titular);
	}
	public void Cantidad() {
		System.out.println("Esta es su cantidad: "+cantidad);
	}
	
	//metodos getters
	// devuelve el valor de un atributo
	public double dameCantidad() {
		return cantidad;
	}
	public String dameTitular() {
		return titular;
	}
	
	//metodos setters
	
	public void nuevoTitular(String nuevoTitular) {
		titular = nuevoTitular;
	}
	public void setCantidad(double cant) {
		cantidad=cant;
	}
	public void ingresaCantidad(double ingresaCantidad) {
	
		if(ingresaCantidad>=0) {
			cantidad+=ingresaCantidad;
		}
	}
	public void retirarCantidad(double retiroCantidad) {
		cantidad -= retiroCantidad;
		if (cantidad < 0) {
			cantidad = 0;
		}
	}

}
