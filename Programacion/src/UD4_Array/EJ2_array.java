package UD4_Array;

public class EJ2_array {

	public static void main(String[] args) {
		//declaramos array
		int [] numeros = new int [100];
		int num=1;
		//rellenamos el array
		for (int i=0; i<100; i++) {
			numeros[i]=num;
			num++;
		}
		//Mostramos array
		for(int i=99; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}
