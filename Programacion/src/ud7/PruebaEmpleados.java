package ud7;

import java.util.Scanner;

public class PruebaEmpleados {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[3];

		
		int cont = 0;
		int opcion = 0;
		do {
			muestraMenu();

			switch (opcion) {
			case 1:

				empleados[cont] = pideDatosDeEmpleadoPorComision();
				cont++;
				break;
			case 2:
				empleados[cont] = pideDatosDeEmpleadoBaseMasComision();
				cont++;

				break;
			case 3:
				for(int i=0; i<cont; i++) {
					System.out.println(empleados[i]);
				}
			case 4:
				System.out.println("Saliste");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}

		} while (opcion != 4);

	}

	public static EmpleadoBaseMasComision pideDatosDeEmpleadoBaseMasComision() {
		String nombre;
		String apellido;
		String nSS;
		double comisionPorVenta;
		int numVentas;
		double salarioBase;

		System.out.println("Datos del empleado:");
		System.out.println("nombre:");
		nombre = in.nextLine();
		System.out.println("Apellido:");
		apellido = in.nextLine();
		System.out.println("NSS:");
		nSS = in.nextLine();
		System.out.println("Comision por venta:");
		comisionPorVenta = Double.parseDouble(in.nextLine());
		System.out.println("Numero de ventas:");
		numVentas = Integer.parseInt(in.nextLine());
		System.out.println("Salario Base:");
		salarioBase = Double.parseDouble(in.nextLine());
		return new EmpleadoBaseMasComision(nombre, apellido, nSS, comisionPorVenta, numVentas, salarioBase);

	}

	public static EmpleadoPorComision pideDatosDeEmpleadoPorComision() {
		String nombre;
		String apellido;
		String nSS;
		double comisionPorVenta;
		int numVentas;

		System.out.println("Datos del empleado:");
		System.out.println("nombre:");
		nombre = in.nextLine();
		System.out.println("Apellido:");
		apellido = in.nextLine();
		System.out.println("NSS:");
		nSS = in.nextLine();
		System.out.println("Comision por venta:");
		comisionPorVenta = Double.parseDouble(in.nextLine());
		System.out.println("Numero de ventas:");
		numVentas = Integer.parseInt(in.nextLine());
		return new EmpleadoPorComision(nombre, apellido, nSS, comisionPorVenta, numVentas);
	}

	public static void muestraMenu() {
		System.out.println("Que tipo de empleado eres?");
		System.out.println("1. Empleado por comision");
		System.out.println("2. Empleado base mas comision");
		System.out.println("3. Saliste");
	}

}
