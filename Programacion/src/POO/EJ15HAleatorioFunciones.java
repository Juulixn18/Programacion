package POO;

import java.util.Random;
import java.util.Scanner;

public class EJ15HAleatorioFunciones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int opcion=0;
		String slot1 = "";
		String slot2 = "";
		String slot3 = "";
		String[] opciones = { "corazon", "diamante", "herradura", "campana", "Limon" };
		int posibilidad;
		do {
			mostrarMenu();
			opcion=in.nextInt();
			if(opcion==1) {
				posibilidad=random.nextInt(5);
				slot1=opciones[posibilidad];
				System.out.print(slot1+" ");
				posibilidad=random.nextInt(5);
				slot2=opciones[posibilidad];
				System.out.print(slot2+" ");
				posibilidad=random.nextInt(5);
				slot3=opciones[posibilidad];
				System.out.print(slot3);
				System.out.println();
				comprobaciones(slot1, slot2, slot3);
			}
			if (opcion==2) {
				System.out.println("Saliste");
			}
			
			
				
		}while(opcion!=2);
	}

	public static void comprobaciones(String pos1, String pos2, String pos3) {

			if (pos1.equals(pos2) || pos2.equals(pos3) || pos1.equals(pos3)) {
				if (pos1.equals(pos2) && pos1.equals(pos3)) {
					System.out.println("Felicidades, ganaste 10 monedas");
				
				}
				System.out.println("Recuperaste la moneda");
			}else{
				System.out.println("Perdiste tu moneda");
			}
		

	}

	public static void mostrarMenu() {
		System.out.println("Introduce una opcion");
		System.out.println("1. Tirar");
		System.out.println("2. Salir");
	}

}
