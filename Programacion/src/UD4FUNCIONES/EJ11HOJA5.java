package UD4FUNCIONES;

import java.util.Scanner;

public class EJ11HOJA5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = in.nextInt();
		System.out.println (esPar(num));
	}

	public static boolean esPar(int num) {

		if (num % 2 == 0) {
			return true; //salto incondicional
		} 
		return false;
	}

}