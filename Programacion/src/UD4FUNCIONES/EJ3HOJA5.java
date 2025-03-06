package UD4FUNCIONES;

public class EJ3HOJA5 {

	public static void main(String[] args) {
		//llamamos a la funcion
		mostrarDel1Al100();
		mostrarDelaAlb(6, 15);

	}

	//Definimos la funcion
	public static void mostrarDel1Al100() {
		int i = 0;

		while (i < 100) {
			i++;
			System.out.println(i);
		}

	}

	// Definimos la funcion
	public static void mostrarDelaAlb(int a, int b) {

		while (a <= b) {
			System.out.println(a);
			a++;
		}

	}

}
