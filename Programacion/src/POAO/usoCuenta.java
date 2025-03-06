package POAO;

import java.util.Scanner;

public class usoCuenta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un titular y la cantidad inicial");
		Cuenta caixa=new Cuenta(in.nextLine()+" "+in.nextDouble());		
		caixa.Titular();

		int opcion=0;
		do {
			System.out.println("1 Ingrsar.");
			System.out.println("2 Retirar.");
			System.out.println("3 Salir.");
			opcion=in.nextInt();
			if (opcion==1) {
				System.out.println("Ingrese la cantidad que desea.");
				caixa.ingresaCantidad(in.nextDouble());
				caixa.Cantidad();
			}
			if (opcion==2) {
				System.out.println("Retire la cantidad que desea.");
				caixa.retirarCantidad(in.nextDouble());
				caixa.Cantidad();
			}
			if (opcion==3) {
				System.out.println("Saliste.");
			}
		}while(opcion!=3);
		
		
		
	}

}
