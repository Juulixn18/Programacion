package POO;

import java.util.Random;

public class EJ14HAleatorio {

	public static void main(String[] args) {
		// Realiza un generador de melodía con las siguientes condiciones:
		// a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
		// sol, la y si.

		// b) Una melodía está formada por un número aleatorio de notas mayor o igual a
		// 4, menor o igual a
		// 28 y siempre múltiplo de 4 (4, 8, 12...).

		// c) Cada grupo de 4 notas será un compás y estará separado del siguiente
		// compás mediante la
		// barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.

		// d) La última nota de la melodía debe coincidir con la primera.
		
		final String[] NOTAS = { "do", "re", "mi", "fa", "sol", "la", "si" };
		
		Random random = new Random();
		System.out.println(NOTAS[random.nextInt(7)]);

	}

}
