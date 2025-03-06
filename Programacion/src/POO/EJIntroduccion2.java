package POO;

import java.util.Scanner;

public class EJIntroduccion2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		enterox2(in);

	}

	private static void enterox2(Scanner in) {
		int numero;
		boolean esEntero = false;
		while (esEntero == false) {
			System.out.println("Introduce un numero entero");
			if (in.hasNextInt()) {
				numero = in.nextInt();
				int resultado = numero * 2;
				System.out.println("El numero introducido " + numero + " x 2 es igual= " + resultado);
			} else {
				System.out.println("Eso no es un numero entero. Intentalo de nuevo");
				in.nextLine();
			}
		}
	}

}
