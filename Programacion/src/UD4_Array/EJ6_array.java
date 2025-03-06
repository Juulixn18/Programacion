package UD4_Array;

import java.util.Scanner;

public class EJ6_array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] numeros = new double[10];

		// Leer 10 números
		System.out.println("Introduce 10 números:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}

		// Calcular suma
		double suma = 0;
		for (double num : numeros) {
			suma += num;
		}

		// Calcular resta
		double resta = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			resta -= numeros[i];
		}

		// Calcular multiplicación
		double multiplicacion = 1;
		for (double num : numeros) {
			multiplicacion *= num;
		}

		// Calcular división
		double division = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] != 0) {
				division /= numeros[i];
			} else {
				System.out.println("No se puede dividir por cero.");
				division = Double.NaN; // Asignar NaN si hay división por cero
				break;
			}
		}

		// Mostrar resultados
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("División: " + (division == Double.NaN ? "Indefinido" : division));

		scanner.close();
	}
}
