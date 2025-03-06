package correccionprimexexamen;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Dime 2 valores");
			int n1 = in.nextInt(), n2 = in.nextInt();

			if (n1 > 100 || n2 > 100 || n1<0 ) {
				System.out.println("error");
			} else {
				for (int i = n1; i <= n2; i++) {

					System.out.println(i);

				}
				for (int i = n1; i >= n2; i--) {

					System.out.println(i);
				}
			}
		}

	}
}
