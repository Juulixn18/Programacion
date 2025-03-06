package Bucles;

import java.util.Scanner;

public class EJ23HojaBucles {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int n, i, k;
			double result;
			n=0;
			i = 0;
			k = 0;
			do {
				System.out.println("Dime las notas");
				n=entrada.nextInt();

				i=i+1;
				k=k+n;
				
				
			}while (n>0);
			
			System.out.println("La media es " +k/(i-1));
		}
		

	}

}
