package POO;

import java.util.Random;

public class EJ5HAleatorio {

	public static void main(String[] args) {
		// Muestra 50 números enteros aleatorios entre 100 y 199
		// (ambos incluidos) separados por
		// espacios. Muestra también el máximo,
		// el mínimo y la media de esos números.
		Random random = new Random();
		int numero;
		int acum = 0;
		int min = 200;
		int max = 99;
		int suma = 0;
		for (int i = 1; i <= 50; i++) {
			numero = random.nextInt(100) + 100;
			System.out.print(numero + " ");
			//Lo siguiente son operadores ternarios
			max = (numero > max) ? numero : max;
			min = (numero < min) ? numero : min;
			suma += numero;
			if (i == 50) {
				System.out.println();
				System.out.println("Minimo: " + min);
				System.out.println("Maximo: " + max);
				System.out.println("Media: " + (suma / 50));

			}
		}

	}

}
