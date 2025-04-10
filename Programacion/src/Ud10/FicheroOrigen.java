package Ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroOrigen {
	public static void main(String[] args) {
		
		FileWriter origen;
		try {
			 origen = new FileWriter("ficheroOrigen.txt");
			 origen.write("hola fichero origen");
			 origen.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
