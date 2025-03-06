package POO;

import java.util.Scanner;

public class EJ28StringBloque2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce nombre y apellidos");
		String nombre = in.nextLine();
	
		String[] nombresApellidosSep = nombre.split(" ");
		
		if (nombresApellidosSep.length==3) {
			System.out.println(nombresApellidosSep[1]+" "+nombresApellidosSep[2]+" "+nombresApellidosSep[0].charAt(0));
		}
		if (nombresApellidosSep.length==4) {
			System.out.println(nombresApellidosSep[2]+" "+nombresApellidosSep[3]+","+nombresApellidosSep[0].charAt(0)+"."+nombresApellidosSep[1].charAt(0)+".");
		}
	}

}
