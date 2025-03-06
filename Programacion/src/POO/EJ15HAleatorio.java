package POO;

import java.util.Random;
import java.util.Scanner;

public class EJ15HAleatorio {

	public static void main(String[] args) {
		/*
		 * 15. Realiza un simulador de máquina tragaperras simplificada que cumpla los
		 * siguientes requisitos: a) El ordenador mostrará una tirada que consiste en
		 * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
		 * campana y limón. b) Si las tres figuras son diferentes se debe mostrar el
		 * mensaje “Lo siento, ha perdido”. c) Si hay dos figuras iguales y una
		 * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. d) Si
		 * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
		 * monedas”.
		 */
		Scanner in = new Scanner(System.in);
		String[] figuras = { "corazón", "diamante", "herradura", "campana", "limón" };
		Random random = new Random();
		int numale;
		System.out.println("Escoge una opcion:");
		int opcion;
		String slot1;
		String slot2;
		String slot3;

		do {
			System.out.println("1. Tirar");
			System.out.println("2. Salir");
			opcion = in.nextInt();

			if (opcion == 1) {
				slot1 = (figuras[random.nextInt(5)] + " ");
				slot2 = (figuras[random.nextInt(5)] + " ");				
				slot3 = (figuras[random.nextInt(5)]);
				System.out.print(slot1+" "+slot2+" "+slot3);
				System.out.println();
				if (slot1.equals(slot2) && slot2.equals(slot3)) {
					System.out.println("Felicidades has ganado 10 monedas");
				} else {
					if (slot1.equals(slot2) || slot2.equals(slot3) || slot1.equals(slot3)) {
						System.out.println("Bien has recuperado tu moneda");
					} else {
						
							System.out.println("Lo siento, ha perdido su moneda");
						}
					}
				}

			
			if (opcion == 2) {
				System.out.println("Saliste");
			}
		} while (opcion != 2);

	}

}
