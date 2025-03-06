package Bucles;

import java.util.Scanner;

public class EJ11HojaBuclesDo {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		char opcion;
		do {
			System.out.println("Desea salir (S/N)?");
			opcion=entrada.nextLine().charAt(0);
		}while (opcion!='s');
		System.out.println("Hasta luego");
	}

}
