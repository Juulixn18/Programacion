package EJEVAL;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * opciones 1suma 2resta 3mult 4div 5factorial 6resto 7decimal->Binario
		 * 8Binario->decimal 9Primo 10salir
		 */
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		System.out.println("Introduce una opcion");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Factorial");
		System.out.println("6. Resto");
		System.out.println("9. Primo");
		System.out.println("10. Salir");
		int opcion = in.nextInt();
		if (opcion < 1 || opcion > 10) {
			System.out.println("Error. Introduzca una opcion correcta");
			opcion = in.nextInt();
		}
		if (opcion>=1 || opcion<=10) {
			while (opcion == 1) {
		
			System.out.println("Introduce dos digitos");
			int n1 = in.nextInt();
			int n2 = in2.nextInt();
			int result = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + result);
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
			}
		while (opcion == 2) {
			System.out.println("Introduce dos digitos");
			int n1 = in.nextInt();
			int n2 = in2.nextInt();
			int result = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + result);
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
		}
		while (opcion == 3) {
			System.out.println("Introduce dos digitos");
			int n1 = in.nextInt();
			int n2 = in2.nextInt();
			double result = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + result);
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
		}
		while (opcion == 4) {
			System.out.println("Introduce dos digitos");
			int n1 = in.nextInt();
			int n2 = in2.nextInt();
			int result = n1 * n2;
			System.out.println(n1 + " x " + n2 + " = " + result);
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
		}
		while (opcion == 5) {
			System.out.println("Introduce un digito");
			int n = in.nextInt();
			for (int i = 1; i <= n + 1; i++) {
				int factorial = 0;
				factorial = factorial + i + (i * i);
				System.out.println(factorial);

			}

			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
		}
		while (opcion == 6) {
			System.out.println("Introduce dos digito");
			int n = in.nextInt();
			int n2 = in2.nextInt();
			double resto;
			resto = n % n2;
			System.out.println(resto);
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();

		}
		while (opcion==9) {
			System.out.println("Introduce un digito");
			int divisores=0;
			int n = in.nextInt();
			for(int i=1; i<=n; i++) {
				if (n%i==0) {
					divisores++;
				}
			}
			if (divisores<=2) {
				System.out.println("Es primo");
			}else {
				System.out.println("No es primo");
			}
			System.out.println("Introduce otra opcion");
			opcion = in.nextInt();
		}
		if (opcion==10) {
			System.out.println("Saliste de la calculadora");
		}
	}
	}

}
