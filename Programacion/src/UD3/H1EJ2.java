//2. que pida un numero y 
//diga si es par o impar.
package UD3;
//Inicio
public class H1EJ2 {
	public static void main(String[] args) {
		//Zona de Declaracion de Variables
		//tipo_de_var nombre_variable o nombreVariable
		int numeroLeido;
		//Mostrar "Introduce un numero"
		System.out.println("Introduce un numero");
		//Leer numeroLeido
		numeroLeido=6;
		// Si(numeroLeido MOD 2 = 0) entonces
		//	Mostrar "Es par"
		//Sino
		//	Mostrar "Es impar"
		if((numeroLeido%2)==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
			
//Fin
	}
}
