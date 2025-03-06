package UD4_Array;

import java.util.Scanner;

public class array_palabras {

	public static void main(String[] args) {
		char[] palabra;
		int numLetras;
		// Habilitam la lectura por teclado
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce cuantas letras tiene la palabra");
		numLetras = in.nextInt();
		// justo despues de leer el entero
		// limpiamos el buffer
		in.nextLine();

		// Definimos el tamaño del array
		palabra = new char[numLetras];

		System.out.println("Introduce la palabra letra a letra");
		for (int i = 0; i < numLetras; i++) {
			palabra[i] = in.nextLine().charAt(0);
		}

		// Mostramos al derecho
		for (int i = 0; i < numLetras; i++) {
			System.out.print(palabra[i]);
		}
		
		System.out.println();

		// Mostramos al reves
		for (int i = numLetras - 1; i >= 0; i--) {
			System.out.print(palabra[i]);
		}
	}

}