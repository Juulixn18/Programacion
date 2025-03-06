package Bucles;

import java.util.Scanner;

public class EJ11HojaBucles {

	public static void main(String[] args) {
		int n1, n2;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce dos numeros");
			n1=entrada.nextInt();
			n2=entrada.nextInt();
		}
		
		while (n1<n2) {
			System.out.println(n1);
			n1++;
		}
		while (n2<n1) {
			n2++;
			System.out.println(n2);
		}
	}

}
