package UD4FUNCIONES;

public class ejemploBooleanos {

	public static void main(String[] args) {
		int numero=5;
		if (!esCero(numero)&&esPositivo(numero)) {
			System.out.println("Es positivo y distinto de cero");
		}
		//con ! en el condicional es como si fuera un not y la funcion
		

	}
	public static boolean esCero(int num) {
	
		/*if (num==0) {
			return true;
		}
		return false;*/
		return (num==0);
	}
	public static boolean esPositivo(int nm) {
		/*if (nm>0) {
			return true;
		}
		return false;*/
		return (nm>0);
	}
}
