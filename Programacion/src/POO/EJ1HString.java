package POO;

import java.util.Scanner;

public class EJ1HString {

	public static void main(String[] args) {
		// Escribir por pantalla cada carácter de una cadena introducida por teclado.
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una cadena");
		String cadena=in.nextLine();
		for (int i=0; i<cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		

	}

}