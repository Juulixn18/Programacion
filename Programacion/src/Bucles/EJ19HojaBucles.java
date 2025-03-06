package Bucles;

import java.util.Scanner;

public class EJ19HojaBucles {

	public static void main(String[] args) {
		int n, i, result;
		i=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero");
		n=entrada.nextInt();
		System.out.println("Tabla del " +n);
		
		while (i<10) {
			i=i+1;
			result=n*i;
			
			System.out.println(n+ " x " +i+ " = " +result);
		
		}
	}

}
