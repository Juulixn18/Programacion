package POO;

import java.util.Scanner;

public class EJ12HString {

	// Definimos variables globales
	static String[] nombres;
	static double[] precios;
	static int[] cantidades;
	final static int TAM = 10;
	static int pos = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		nombres = new String[TAM];
		precios = new double[TAM];
		cantidades = new int[TAM];
		String nombre = " ";
		double precio = 0;
		int cant = 0;
		Scanner in = new Scanner(System.in);
		int opcion = 0;
		do {
			mostrarMenu();
			opcion = in.nextInt();
			in.nextLine();
			switch (opcion) {
			case 1: {
				// devuelve boolean
				System.out.println("Introduce nombre, precio y cantidad");
				nombre = in.nextLine();

				precio = in.nextDouble();
				cant = in.nextInt();

				if (insertarProducto(nombre, precio, cant))
					System.out.println("Producto insertado");
				else
					System.out.println("Producto NO insertado");
				break;
			}
			case 2: {
				// es Void ya que no devuelve y lo muestra
				System.out.println("Que producto quieres buscar:");
				nombre = in.nextLine();
				buscarYMostrarProducto(nombre);
				break;
			}
			case 3: {
				System.out.println("Introduce el producto a cambiar");
				nombre = in.nextLine();		
				System.out.println("Introduce el precio y stock del producto");
			

				precio = in.nextDouble();
				cant = in.nextInt();
				modificarProducto(nombre, precio, cant);
				break;
			}
			case 4: {
				System.out.println("Has salido");
				break;
			}
			default:

			}
		} while (opcion != 4);

	}

	public static void mostrarMenu() {
		System.out.println("ALMACEN DE PRODUCTOS");
		System.out.println("1. Insertar");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Modificar");
		System.out.println("4. Salir");
	}

	public static boolean insertarProducto(String nombre, double precio, int cant) {
		if (pos == TAM)
			return false;
		for (int i = 0; i < pos; i++) {
			if (nombre.equals(nombres[i])) {
				return false;
			}
		}
		// el almacen tiene espacio y el producto no existe
		nombres[pos] = nombre;
		precios[pos] = precio;
		cantidades[pos] = cant;
		pos++;
		return true;
	}

	public static void buscarYMostrarProducto(String nombre) {
		for (int i = 0; i < TAM; i++) {
			if (nombre.equals(nombres[i]))
				System.out.println("Producto: "+nombres[i] + " Precio: " + precios[i] + "€ Cantidad: " + cantidades[i]);
		}

	}
	public static boolean modificarProducto(String nombre, double precio, int cant) {

			if (pos == TAM) {
				return false;
				}
			for (int i = 0; i < pos; i++) {
				if (nombre.equals(nombres[i])) {
				
					precios[i] = precio;
					cantidades[i] = cant;
					
					return true;
				}
			}
			return false;		
	}
}
