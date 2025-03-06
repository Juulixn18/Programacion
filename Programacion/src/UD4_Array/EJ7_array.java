package UD4_Array;

import java.util.Scanner;

public class EJ7_array {

	public static void main(String[] args) {
		//7. Que lea 10 números por teclado, 
		//los almacene en un array y los ordene 
		//de forma ascendente.
		
		//inicializamos array
		int [] num=new int[5];
		
		//Scanner
		Scanner in=new Scanner(System.in);
		System.out.println("Dime 5 numeros");
		
		//guardamos en el array
		for (int i=0; i<num.length; i++) {
			num[i]=in.nextInt();
		}
		
		int temp=0;
		//mostramos de manera ordenada
		for (int i=0; i<num.length;i++) {
		
			for (int j=0; j<num.length-1-i; j++) {
				if (num[j] > num[j +1]) {
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
				
			}
			
			
		}
		
		for(int j=0; j<num.length; j++) {
			System.out.println(num[j]);
		}
		
	}

}
