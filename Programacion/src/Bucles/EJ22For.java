package Bucles;

import java.util.Scanner;

public class EJ22For {

	public static void main(String[] args) {
		int n, i;
		double suma=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce 10 notas");
		//Definimos una constante con final y se escriben en mayusculas
		final int CANTIDAD=10;
		for (i=0; i<CANTIDAD; i=i+1) {
						
			n=entrada.nextInt();
			suma=suma+n;
			
			  
		}
		System.out.println("La mededia es " +suma/CANTIDAD);
		
		}

}
