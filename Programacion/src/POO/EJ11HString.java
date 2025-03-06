package POO;

import java.util.Scanner;

public class EJ11HString {

	public static void main(String[] args) {
		// Ejercicio 11. Realizar una función a la que se le pasa por parámetro una
		// cadena
		// con un email, y dicha función devuelve si el mail está bien formado.
		// Un email está bien formado cuando:
		// 1.1.- Contiene una y solo una arroba.
		// 1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
		// 1.3.- No puede contener ' '
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceme un correo electronico");
		String correo = in.nextLine();
		while (comprobar(correo) == false) {
			System.out.println("Introduce el correo de nuevo");
			correo = in.nextLine();
		}
		if (comprobar(correo) == true) {
			System.out.println("Correo correcto");
		}
	}

	public static boolean comprobar(String correo) {
		int cont = 0;
		String []parte=correo.split("@");
		for (int i = 0; i < correo.length(); i++) {

			if (correo.charAt(i) == '@') {
				cont++;
				if (cont > 1) {
					return false;
				}
			}
			if(parte[1].contains("..")==true) {
				return false;
			}
			if (correo.charAt(i) == ' ') {
				return false;
			}
		}
		return true;
	}

}
