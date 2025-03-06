package POO;

import java.util.Random;

public class EJ9HAleatorio {

	public static void main(String[] args) {
		// Realiza un programa que vaya generando números 
		// aleatorios pares entre 0 y 100 y que no
		// termine de generar números hasta que no saque
		// el 24. El programa deberá decir al final cuántos
		// números se han generado.
		Random random = new Random();
		System.out.println("Numeros generados hasta el 24:");
		int i=0;
		int num=0;
	
		while(num!=24) {
			num=random.nextInt(50*2)+1;
			if (num%2==0) {
				System.out.println(num=random.nextInt(50*2)+1);
				i++;
			}else {
				num=random.nextInt(100);
			}
			
		}
		System.out.println("Ha tardado en salir " + i + " numeros");
	}

}
