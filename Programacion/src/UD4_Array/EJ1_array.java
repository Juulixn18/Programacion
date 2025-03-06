package UD4_Array;


public class EJ1_array {

	public static void main(String[] args) {
		
		int [] numeros = new int [100];
		int num=1;
		for (int i=0; i<100; i++) {
			numeros[i]=num;
			num++;
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(numeros[i]);
		}
	}

}
