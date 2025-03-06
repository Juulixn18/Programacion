package UD4_Array;

import java.util.Scanner;

public class EJ8_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce 10 numeros");
		//declaramos el array
		int [] array1=new int [5];
		int [] array2=new int [5];
		int [] array3=new int [10];
		//rellenamos el array con dos bucles
		for (int i=0; i<array1.length; i++) {
			//inicializamos la variable num y la leemos y luego 
			//la guardamos en la posicion de array que va cambiando
			//en cada vuelta de bucle
			int num=in.nextInt();
			array1[i]=num;
		}
		for (int i=0; i<array2.length; i++) {
			int num=in.nextInt();
			array2[i]=num;
		}
		
		//copiamos ambos arrays en el 3
		for (int i=0, j=5; i<array1.length; i++,j++) {
			array3[i]=array1[i];
			array3[j]=array2[i];
			
		}
		for (int i=0; i<array3.length; i++) {
			System.out.print(array3[i]+ ", ");
		}
		
		
	}

}