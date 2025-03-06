//Que pida 3 numeros y muestre de 
//mayor a menor por pantalla
package UD3;

public class H1EJ5 {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = 10;
		n2 = 4;
		n3 = 5;
		if (n1 < n2 && n2 < n3) {
			System.out.println(n1 + ", " + n2 + ", " + n3 + " Ese es el orden");
		} else if (n2 < n1 && n1 < n3) {
			System.out.println(n2 + ", " + n1 + ", " + n3 + " Ese es el orden");
		} else if (n3 < n1 && n1 < n2) {
			System.out.println(n3 + ", " + n1 + ", " + n2 + " Ese es el orden");
		} else if (n1 < n3 && n3 < n2) {
			System.out.println(n1 + ", " + n3 + ", " + n2 + " Ese es el orden");
		} else if (n2 < n3 && n3 < n1) {
			System.out.println(n2 + ", " + n3 + ", " + n1 + " Ese es el orden");
		} else if (n3 < n2 && n2 < n1) {
			System.out.println(n3 + ", " + n2 + ", " + n1 + " Ese es el orden");
		}
	}
}