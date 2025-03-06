package EJEVAL;

import java.util.Scanner;

public class CalculadoraFunciones {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Calculadora de Julian Alexander Cueva");
		char opcion = ' ';
		Mostrar_menu();
		double op1;
		double op2;
		double result;
		do {

			System.out.println("Elige una opcion");
			opcion = in.nextLine().charAt(0);
			if (opcion == 's' || opcion == 'S') {
				System.out.println("Introduce el primer operador");
				op1 = in.nextDouble();
				System.out.println("Introduce el segundo operador");
				op2 = in.nextDouble();
				result = Suma(op1, op2);
				System.out.println("El resultado de la operacion es:");
				System.out.println(result);
				System.out.println();
				Mostrar_menu();

			}
			if (opcion == 'r' || opcion == 'R') {
				System.out.println("Introduce el primer operador");
				op1 = in.nextDouble();
				System.out.println("Introduce el segundo operador");
				op2 = in.nextDouble();
				result = Resta(op1, op2);
				System.out.println("El resultado de la operacion es:");
				System.out.println(result);
				System.out.println();
				Mostrar_menu();

			}
			if (opcion == 'm' || opcion == 'M') {
				System.out.println("Introduce el primer operador");
				op1 = in.nextDouble();
				System.out.println("Introduce el segundo operador");
				op2 = in.nextDouble();
				result = Multiplicacion(op1, op2);
				System.out.println("El resultado de la operacion es:");
				System.out.println(result);
				System.out.println();
				Mostrar_menu();

			}
			if (opcion == 'd' || opcion == 'D') {
				System.out.println("Introduce el primer operador");
				op1 = in.nextDouble();
				System.out.println("Introduce el segundo operador");
				op2 = in.nextDouble();
				result = Division(op1, op2);
				System.out.println("El resultado de la operacion es:");
				System.out.println(result);
				System.out.println();
				Mostrar_menu();

			}
			if (opcion == 'a' || opcion == 'A') {
				System.out.println("Saliste de la calculadora");
			}
		} while (opcion != 'S' && opcion != 'R' && opcion != 'M' && opcion != 'D' && opcion != 'A' && opcion != 's'
				&& opcion != 'r' && opcion != 'm' && opcion != 'd' && opcion != 'a');
	}

	public static double Suma(double op1, double op2) {

		double result = op1 + op2;
		return result;

	}

	public static double Resta(double op1, double op2) {

		double result = op1 - op2;
		return result;
	}

	public static double Multiplicacion(double op1, double op2) {
		double result = op1 * op2;
		return result;

	}

	public static double Division(double op1, double op2) {
		double result = op1 / op2;
		return result;

	}

	public static void Mostrar_menu() {

		System.out.println("S: Suma");
		System.out.println("R: Resta");
		System.out.println("M: Multiplicacion");
		System.out.println("D: Division");
		System.out.println("A: sAlir");
	}

}
