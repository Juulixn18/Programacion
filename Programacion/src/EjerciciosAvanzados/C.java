package EjerciciosAvanzados;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de filas");
		int nfilas = entrada.nextInt();
		int fila, n_esp, n_ast;
		for (fila = 1; fila <= nfilas; fila++) {

			for (n_esp = 0; n_esp <= nfilas - fila - 1; n_esp++) {

				System.out.print(" ");

			}
			for (n_ast = 1; n_ast <= ((2 * fila) - 1); n_ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (fila = 1; fila <= nfilas; fila++) {

			for (n_esp = 0; n_esp <= nfilas - fila - 1; n_esp++) {

				System.out.print(" ");

			}
			for (n_ast = 1; n_ast <= ((2 * fila) - 1); n_ast++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
