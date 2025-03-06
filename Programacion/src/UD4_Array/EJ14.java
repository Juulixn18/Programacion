package UD4_Array;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		final int TAM=20;
		int[] num = new int[TAM];
		int cont=0, posicionNumeroEncontrado=0;;
		boolean numeroencontrado=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce 5 numeros");
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		System.out.println("Que numero quieres del array");
		int numerousuario = in.nextInt();

		//SOLUCION1
		/*
		for (int i = 0; i < num.length; i++) {
			if (numerousuario == num[i]) {

				System.out.println("El numero buscado esta en la posicion "+(i+1));
				cont++;
				//break;
				//i=num.length;

			}
		}
		if (cont==0) {
			System.out.println("El numero no se ha encontrado");
		}
		*/
		//SOLUCION2
		while ((numeroencontrado==false)&&(cont<TAM)) {
			if (num[cont]==numerousuario) {
				posicionNumeroEncontrado=cont;
				numeroencontrado=true;
			}
			cont++;
		}
		if (numeroencontrado==false) {
			System.out.println("El numero no se ha encontrado");
		}else {
			System.out.println(numerousuario+ " esta en la posicion:" +(posicionNumeroEncontrado+1));
		}
	}
}
