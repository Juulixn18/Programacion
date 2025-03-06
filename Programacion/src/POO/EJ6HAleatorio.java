package POO;

import java.util.Random;
import java.util.Scanner;

public class EJ6HAleatorio {

	public static void main(String[] args) {
		// Escribe un programa que piense un número al azar
		//entre 0 y 100. El usuario debe adivinarlo y
		//tiene para ello 5 oportunidades. Después de 
		//cada intento fallido, el programa dirá cuántas
		//oportunidades quedan y si el número introducido
		//es menor o mayor que el número secreto.
		Random random=new Random();
		Scanner in =new Scanner(System.in);
		int num;
		int numparticipante;		
		num=random.nextInt(100)+1;
		
		System.out.println("Introduce un numero y tienes 5 oportunidades");
		for (int i=0; i<5; i++) {
			numparticipante=in.nextInt();
			if(num==numparticipante) {
				System.out.println("El numero es correcto lo adivinaste en el intento: "+i);
			}
			if(i==4&&num!=numparticipante) {
				System.out.println("Te quedaste sin intentos y no acertaste");
			}
		}
	}

}
