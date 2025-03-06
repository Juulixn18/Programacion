package POO;

import java.util.Random;

public class EJ15HAleatoriovisvis {

	public static void main(String[] args) {
		String[] figuras = { "corazón", "diamante", "herradura", "campana", "limon" };
		int[] freqFiguras = new int[5];
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			int numale = random.nextInt(5);
			System.out.println(figuras[numale]);
			freqFiguras[numale]++;
			
		}
		comprobarSiHasGanado(freqFiguras);

	}

	public static boolean comprobarSiHasGanado(int[] freqFiguras) {
		for (int i = 0; i < freqFiguras.length; i++) {
			if (freqFiguras[i] == 3) {
				System.out.println("Has ganado 10 monedas");
				return true;
			}
			if (freqFiguras[i] == 2) {
				System.out.println("Recuperaste la moneda");
				return true;
			}
		}
		System.out.println("Has perdido");
		return false;
	}
}
