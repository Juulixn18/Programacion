package POO;

import java.util.Random;
import java.util.Scanner;

public class EJnoEvaluable {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int dado1;
		int dado2;
		int opcion;
		int tiradas = 0;
		System.out.println("1. Tirar");
		System.out.println("2. Salir");
		opcion = in.nextInt();
		do {
			dado1 = random.nextInt(6) + 1;
			dado2 = random.nextInt(6) + 1;
			tiradas++;
			System.out.println("Tirada: " + tiradas);
			System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
			System.out.println("Suma: " + (dado1 + dado2));
			System.out.println("1. Tirar");
			System.out.println("2. Salir");
			opcion = in.nextInt();
		} while (opcion != 2);

	}

}
