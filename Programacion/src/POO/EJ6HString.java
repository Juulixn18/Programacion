package POO;

import java.util.Scanner;

public class EJ6HString {

	public static void main(String[] args) {
		// Realizar un programa que dada una cadena de caracteres 
		//por caracteres, genere otra cadena resultado de invertir la primers
		Scanner in = new Scanner(System.in);
		System.out.println("Introdce una cadena");
		String cad=in.nextLine();
		String cadinver="";
		for (int i=cad.length()-1; i>=0; i--) {
			char car=cad.charAt(i);
			cadinver=cadinver+car;
		}
		System.out.println("Esta es la cadena leida:");
		System.out.println(cad);
		System.out.println("Esta es la cadena invertida");
		System.out.println(cadinver);
		
	}

}
