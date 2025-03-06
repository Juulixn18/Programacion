package EjerciciosAvanzados;

import java.util.Scanner;

public class Cvis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un rango");
		int nfilas = in.nextInt();
		int fila, ast, esp;
		for (fila = 1; fila <= nfilas; fila++) {
			
			for (esp = 0; esp <= nfilas - fila - 1; esp++) {
				
				System.out.print(" ");
			}
			
			for (ast = 1; ast <= ((2 * fila) - 1); ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (nfilas=nfilas; nfilas<=fila; nfilas--) {
			for (esp=nfilas-fila-1; esp<=0; esp--) {
				System.out.print(" ");
			}
			for(ast=((2*fila)-1); ast>=1; ast--) {
				System.out.print("*");	
			}
			System.out.println();
		}	
		
	}

}
