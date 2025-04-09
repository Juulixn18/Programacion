package Ud10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		FileWriter salida;
		Random aleatorio;
		
		try {
			//Construyo el flujo o canal de salida
			salida=new FileWriter("ficheroAleatorios.txt");
			for(int i=1; i<=10; i++) {
				aleatorio=new Random(100);
				salida.write(aleatorio+""+"\n");
			}
			//cierro el canal o flujo, siempre hay que hacerlo en ficheros
			salida.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
