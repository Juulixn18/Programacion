package UD4FUNCIONES;

public class ambitovariables {

	static int numGlobal;

	public static void main(String[] args) {
		numGlobal=20;
		int num = 10;
		for (int i = 0; i < 10; i++) {
			int a = 1;
			System.out.println("a: " + a);
			System.out.println(i);
			a++;
		}
		imprime(num);
		numGlobal++;
	}

	public static void imprime(int num) {
		System.out.println(num);
		System.out.println(numGlobal);
	}

}
