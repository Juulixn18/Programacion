package Ud10;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnModoTexto {
	public static void main (String [] args) {
		
		//Defino el flujo o canal de salida
		FileWriter salida;
		
		try {
			//Construyo el flujo o canal de salida
			salida=new FileWriter("fichero.txt");
			for(int i=1; i<=10; i++) {
				salida.write(i+"");
			}
			//cierro el canal o flujo, siempre hay que hacerlo en ficheros
			salida.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
