package POO;

import java.util.Scanner;

public class EJ7HString {

	public static void main(String[] args) {
		// Pide una cadena y dos caracteres por teclado 
		// (valida que sea un carácter), sustituye la aparición
		// del primer carácter en la cadena por el segundo carácter.
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad=in.nextLine();
		System.out.println("Introduce caracter a cambiar");
		char car=in.nextLine().charAt(0);
		System.out.println("Introduce caracter por el que se cambiara");
		char car2=in.nextLine().charAt(0);
		System.out.println(cad.replace(car, car2));
	}

}
