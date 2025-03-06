package UD4FUNCIONES;

import java.util.Scanner;

public class EJ2HOJA5 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("De que numero quieres el cuadrado");
		int n=in.nextInt();
		cuad(n);
		int cuadrado=cuad(n);
		System.out.println(cuadrado);

	}
	public static int cuad(int a) {
		int cuadrado=a*a;
		return cuadrado;
	}

}
