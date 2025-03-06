package POO;

import java.util.Random;

public class EjemploRandom {

	public static void main(String[] args) {
		// Clase Random
		//1. Lo primero crear un objeto
		Random random=new Random();
		int dado1=random.nextInt(6)+1;
		int dado2=random.nextInt(6)+1;
		System.out.println(dado1+" "+dado2);
		int cont=1;
		
		while (dado1!=dado2) {
			dado1=random.nextInt(6)+1;
			dado2=random.nextInt(6)+1;
			System.out.println(dado1+" "+dado2);
			cont++;
		}
	
			
			System.out.println(cont);
		

	}

}
