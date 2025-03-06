package POO;

import java.util.Scanner;

public class EJ6HStringBloque2 {

	public static void main(String[] args) {
		//6. Elabora un programa que escriba todos los
		//caracteres de una cadena cada uno en una línea.
		Scanner in= new Scanner (System.in);
		System.out.println("Introduce tu cadena");
		String cad=in.nextLine();
		System.out.println("Cadena escrita letra a letra");{
			for (int i = 0; i <cad.length() ; i++) {
				System.out.println(cad.charAt(i));
			}
		}
	}

}
