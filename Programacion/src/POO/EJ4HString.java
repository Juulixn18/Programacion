package POO;

import java.util.Scanner;

public class EJ4HString {

	public static void main(String[] args) {
		// Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
		// separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
		Scanner in=new Scanner(System.in);
		System.out.println("Dime una cadena");
		String cadena=in.nextLine();
		int cont=0;
		for(int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)==' '+' ') {
				cont--;
			}else if(cadena.charAt(i)==' ') {
				cont++;
			}
		}
		System.out.println("La cadena tiene "+((cont))+" palabras");
		
		
	}

}
