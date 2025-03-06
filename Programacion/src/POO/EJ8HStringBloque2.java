package POO;

import java.util.Scanner;

public class EJ8HStringBloque2 {

	public static void main(String[] args) {
		// 8. Repite el ejercicio anterior pero usando indexOf.
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad = in.nextLine();
		System.out.println("Introduce el caracter a buscar");
		char car = in.nextLine().charAt(0);
		boolean encontrado = false;
		int diferenciacadenas=cad.length();
		while(cad.indexOf(car)>=0) {
			encontrado=true;
			System.out.println(car+": "+(cad.indexOf(car)+(diferenciacadenas-cad.length())));
			cad=cad.substring(cad.indexOf(car)+1);
		}
		if (encontrado) {

		} else {
			System.out.println("Caracter: " + car + " no encontrado");
		}
	}

}
