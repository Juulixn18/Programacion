package Bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1, n2, n3, i;
		Scanner entrada=new Scanner (System.in);
		
		i=entrada.nextInt();
		
		n1=0;
		n2=1;
		n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		while (i<25) {
			i=0;
			i=i+1;
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
		}
		
	}

}
