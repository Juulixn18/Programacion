package Bucles;

import java.util.Scanner;

public class EJ20HojaBucles {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		char opcion;
		System.out.println("Desea salir (S/N)");
		opcion=entrada.nextLine().charAt(0);
		while (opcion!='s') {
			System.out.println("Desea salir (S/N)");
			opcion=entrada.nextLine().charAt(0);
		}
		System.out.println("Saliste del programa");
	}

}
