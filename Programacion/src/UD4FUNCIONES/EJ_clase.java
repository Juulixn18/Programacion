package UD4FUNCIONES;

import java.util.Scanner;

public class EJ_clase {

	public static void main(String[] args) {
		// Escribir una funcion a la que se le pasa
		//por parametro un array de 5 posiciones ent
		//y devuelve un array con los valores multip
		//plicados por dos
		
		//posteriormente realizar un metodo princip
		//que lea 5 numeros por teclado, los almacene
		//en un array y llame a la funcion anterior
		
		//Por ultimo mostrar el contenido del array 
		//cuyos valores son el del primer array
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dime 5 numeros");
		int []num1= {5,8,9,10,1};
		
		for (int i=0; i<5; i++) {
			num1[i]=in.nextInt();
			
		}
		doble(num1);
		
		

	}
	
	public static void doble(int num[]){
		for (int i=0; i<5; i++) {
		System.out.println(num[i]*2);	
		}
	}

}
