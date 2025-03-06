package UD4_Array;

import java.util.Scanner;

public class EJ {

	public static void main(String[] args) {
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);
		//Defino el array y reservo RAM
		int [] numeros=new int [5];
		System.out.println("Introdce 5 valores");
		//guardo dos numeros en el array
//		numeros[0]=entrada.nextInt();
//		numeros[1]=entrada.nextInt();
//		numeros[2]=entrada.nextInt();
//		numeros[3]=entrada.nextInt();
//		numeros[4]=entrada.nextInt();
		//hacemos lo mismo de antes de forma programatica
		for (int i=0; i<5; i++) {
			numeros[i]=entrada.nextInt();
		}
		//mostrar los datos que hay almacenados en el arrya
//		System.err.println(numeros[0]);
//		System.err.println(numeros[1]);
//		System.err.println(numeros[2]);
//		System.err.println(numeros[3]);
//		System.err.println(numeros[4]);
		
		//mostramos los datos del array mediante bucle for
		for (int i=0; i<5; i++) {
			System.out.println("n. " +numeros[i]);
		}
	}

}
