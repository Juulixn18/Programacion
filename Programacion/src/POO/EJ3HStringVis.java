package POO;

import java.util.Scanner;

public class EJ3HStringVis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = "";
		System.out.println("Introduce una cadena");
		cad = in.nextLine();
		String cadLeida = " ";
		char car=' ';
		do {
			System.out.println("Introduce un caracter y solo uno");
			cadLeida=in.nextLine();
			car=cadLeida.charAt(0);
			
		}while(cadLeida.length()!=1 || car==' ');
		int cont = contarCaracter(cad, car);
		System.out.println("La cadena es:");
		System.out.println(cad);
		System.out.println("La letra a buscar es: "+car+" y aparece: "+cont+" veces");
	}

	public static int contarCaracter(String cad, char car) {
		int cont=0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i)==car) {
				cont++;
			}
		}
		return cont;
	}

}
