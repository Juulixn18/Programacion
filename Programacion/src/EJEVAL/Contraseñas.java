package EJEVAL;

import java.util.Random;
import java.util.Scanner;

public class Contraseñas {
	static String caracteres = "@#$_";
	static String caracteres2="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static Random random = new Random();
	public static void main(String[] args) {
//		Para las contraseñas débiles, el programa deberá 
//		generar una contraseña de longitud fija (por ejemplo, 
//		6 caracteres) compuesta únicamente por letras minúsculas.
//
//		Para las contraseñas fuertes, el programa debe generar 
//		una contraseña de longitud específica ingresada por el 
//		usuario (por ejemplo, entre 8 y 12 caracteres). Estas 
//		contraseñas deben incluir una combinación de letras
//		mayúsculas, minúsculas, números y al menos un carácter 
//		especial, como '@', '#', '$', '_'.
//
//		El programa deberá mostrar la contraseña generada según 
//		la elección del usuario.
		
		Scanner in = new Scanner(System.in);
		System.out.println("Quieres una cadena fuerete o debil?");
		String opcion=in.nextLine();
		String contraseña;
		if(opcion.equals("debil")) {
			System.out.println("Contraseña generada");
			contraseña=generaCadenaDebil();
			System.out.println(contraseña);
		}
		if(opcion.equals("fuerte")) {
			System.out.println("Contraseña generada");
			contraseña=generaCadenaFuerte();
			System.out.println(contraseña);
		}

	}
	public static String generaCadenaDebil() {
		String cadena="";
		int posibilidad;
		for(int i=0; i<6; i++) {
			posibilidad=random.nextInt(25)+97;
			cadena=cadena+(char)posibilidad;
		}
		return cadena;
	}
	public static String generaCadenaFuerte() {
		String cadena="";
		int posibilidad=random.nextInt(4)+8;
		int posibilidad2;
		int posibilidad3=random.nextInt(posibilidad);
		for(int i=0; i<posibilidad; i++) {
			posibilidad2=random.nextInt(60);
			cadena=cadena+caracteres2.charAt(posibilidad2);
			if (i==posibilidad3 && posibilidad3<=posibilidad) {
				posibilidad2=random.nextInt(4);
				cadena=cadena+caracteres.charAt(posibilidad2);
				
			}
		}
		return cadena;
		
	}

}
