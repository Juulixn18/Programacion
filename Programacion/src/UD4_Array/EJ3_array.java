package UD4_Array;

import java.util.Scanner;

public class EJ3_array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Que rango de primos quieres?");
		int limite = in.nextInt();
		int divisores;
		int contPrimos=0;
		int indice=0;
		for (int i = 1; i <= limite; i++) {
			divisores = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					divisores++;
					break;
				}
			}
			if (divisores != 1) {
				//System.out.println(i);
				contPrimos++;
			}
		}
		int []primos=new int[contPrimos];
		
		for (int i = 1; i <= limite; i++) {
			divisores = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					divisores++;
					break;
				}
				
			}
			if (divisores != 1) {
				primos[indice]=i;
				indice++;
			}
		}
		for (int i=0; i<primos.length; i++) {
			System.out.println(primos[i]);
		}
	}

}
