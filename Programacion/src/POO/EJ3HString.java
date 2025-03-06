package POO;

import java.util.Scanner;

public class EJ3HString {

	public static void main(String[] args) {
		try (// public static void main(String[] args) {
				// Pide una cadena y un carácter por teclado
				// (valida que sea un carácter) y muestra cuantas veces
				// aparece el carácter en la cadena.
		Scanner in = new Scanner(System.in)) {
			System.out.println("Dime una frase");
			int contletra=0;
			String cadena = in.nextLine();
			System.out.println("Dime una letra de la palabra");
			char letra=in.nextLine().charAt(0);
			while (!Character.isLetter(letra)) {
				System.out.println("Introduce de nuevo");
				letra=in.nextLine().charAt(0);
			}
			for (int i=0; i<cadena.length(); i++) {
				if (cadena.charAt(i)==letra) {
					contletra++;
				}
			}
			System.out.println("La frase es: "+cadena);
			System.out.println("La letra es: "+letra);
			System.out.println("Las veces que sale la letra: "+contletra);
		}
		
		
	}

}