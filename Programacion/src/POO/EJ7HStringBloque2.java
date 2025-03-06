package POO;

import java.util.Scanner;

public class EJ7HStringBloque2 {
	// 7. Pedir al usuario una frase y un carácter,
	// y decir en qué posiciones está ese carácter, o indicar
	// que no está si procede. No se puede usar indexOf o similar.
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		System.out.println("Introduce el caracter a buscar");
		char car = in.nextLine().charAt(0);
		boolean encontrado = false;
		int i;
		for (i = 0; i < cad.length(); i++) {
			if (car == cad.charAt(i)) {
				encontrado = true;
				if (encontrado) {
					System.out.println("Caracter: " + car + " encontrado en la posicion: " + (i + 1));
				}
			}
		}
		if (encontrado) {

		} else {
			System.out.println("Caracter: " + car + " no encontrado");
		}
	}

}
