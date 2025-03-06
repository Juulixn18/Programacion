package POO;

import java.util.Scanner;

public class EJ5HStringBloque2 {

	public static void main(String[] args) {
		//5. Programa que pida un carácter c y un número 
		//n y que devuelva una cadena con c repetido n veces.
		Scanner in = new Scanner (System.in);
		System.out.println("Dime un caracter y las veces que quieres que se repita");
		char car=in.nextLine().charAt(0);
		int n=in.nextInt();
		
		String cad;
		for (int i=0; i<n; i++) {
			cad=car+"";
			System.out.print(cad);
		}
	}

}
