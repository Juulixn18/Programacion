package POO;

import java.util.Scanner;

public class claseutilitaria {

	public static void main(String[] args) {
		/*
		 * System.out.println(Math.E); System.out.println(Math.abs(-60));
		 * System.out.println(Math.floor(54.9)); System.out.println(Math.ceil(2.1));
		 * System.out.println(Math.round(87.2)); System.out.println(Integer.MAX_VALUE);
		 * System.out.println(Integer.MIN_VALUE); int num1=Integer.parseInt("11")+1;
		 * System.out.println(num1); double num2=Double.parseDouble("12.5")+2.2;
		 * System.out.println(num2); int num=97; char letra=97;
		 * System.out.println(letra);
		 */
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[5];
		String[] nombre = new String[5];

		System.out.println("Rellena las edades");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=in.nextInt();
			String edad=numeros[i]+"";
			System.out.println(edad);
		}
		System.out.println("Rellena los nombres");
		for (int i = 0; i < nombre.length; i++) {
			nombre[i]=in.nextLine();
			String nom=nombre[i]+"";
			System.out.println(nom);
		}
	}

}
