package UD4FUNCIONES;

import java.util.Scanner;

public class EJ8HOJA5{

	public static void main(String[] args) {
//        Que pida por pantalla un número del 1 al 10 y mediante una función muestre por
//        pantalla el número escrito en letras.
		Scanner entrada = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Dime un número del 1 al 10");
			numero = entrada.nextInt();
			if (numero > 10 || numero < 1) {
				System.out.println("el numero esta fuera de rango");
			}
		} while (numero > 10 || numero < 1);
		mostrarNumeroComoLetras(numero);
	}

	public static void mostrarNumeroComoLetras(int num) {
		String arrayNumeros[] = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
		System.out.println("Tú numero " + num + " en letras es: " + arrayNumeros[num - 1]);
	}
}