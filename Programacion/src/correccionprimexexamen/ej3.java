package correccionprimexexamen;

import java.util.Scanner;

public class ej3 {
	/*pide un caracter y mostramos menu 
	 * si es igual a 'p' mostrar numeros entre 1 y 500 pares
	 * si es 'i' numeros entre 1 - 500 impares
	 * si es cualquier otro error y pedira al usuario de nuevo
	 */
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Escoge una opcion 'p' o 'i'");
			char opcion=in.nextLine().charAt(0);
			
		
		do {
			if (opcion!='p' && opcion!='i') {
				System.out.println("error introduce el la opcion correcta");
				opcion=in.nextLine().charAt(0);
			}
			
			if (opcion=='p') {
				for (int i=0; i<=500; i++) {
					if (i%2==0) {
						System.out.println(i);
					}
				}
			}
			if (opcion=='i') {
				for (int i=0; i<=500; i++) {
					if (i%2!=0) {
						System.out.println(i);
					}
				}
			}
			
		}while (opcion!='p'&&opcion!='i');
		

	}

}
