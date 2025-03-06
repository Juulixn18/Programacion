package EjerciciosAvanzados;

import java.util.Scanner;

public class EJ1Avanzados {

	public static void main(String[] args) {
		int n, resto, resto2, resto3;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero de 3 cifras");
		n=entrada.nextInt();
		if (n<100 || n>1000) {
			System.out.println("Error");
		}
		resto=n/100;
		resto2=n%100/10;
		resto3=n%10;
		if ((resto*resto*resto)+(resto2*resto2*resto2)+(resto3*resto3*resto3)==n) {
			System.out.println(n+ " Es un numero Armstrong");
		}else {
			System.out.println(n+ " No es un numero Armstrong");
		}
		
	}

}
