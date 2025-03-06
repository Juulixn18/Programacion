package POO;

import java.util.Scanner;

public class EJIntroduccion {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime un numero entero");
		int num;
		while (!in.hasNextInt()) {
			System.out.println("Error, introduce numero entero");
			in.nextLine();
		}
		num=in.nextInt();
		
			System.out.println("Numero correcto");
			System.out.println((num*2));
		}
	}

