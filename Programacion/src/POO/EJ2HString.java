package POO;

import java.util.Scanner;

public class EJ2HString {

	public static void main(String[] args) {
		// Realizar un programa que comprueba si una cadena leída 
		// por teclado comienza por una subcadena introducida por teclado
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadena=in.nextLine();
		System.out.println("Introduce una segunda cadena");
		String cadena2=in.nextLine();
		if (cadena.startsWith(cadena2)) {
			System.out.println("Son iguales");
		}else {
		System.out.println("No son iguales");
		}
	}

}