package POO;

import java.util.Random;

public class EJ7HAleatorio {

	public static void main(String[] args) {
		// Escribe un programa que muestre tres 
		// apuestas de la quiniela en tres columnas para los 14
		// partidos y el pleno al quince (15 filas).
		for (int j = 1; j <4; j++) {
			System.out.println("Apuesta "+j);
			for (int i=1; i<=15; i++) {
				System.out.println(i+" "+dameResultado());
			
				
			}
		}
		System.out.println("Pleno al 15:"+dameResultado());
		
		
		
		}
	public static char dameResultado() {
		Random random=new Random(3);
		String posiblesResultado="1x2";
		char resultado=posiblesResultado.charAt(
				random.nextInt(3));
		return resultado;
	}

}
