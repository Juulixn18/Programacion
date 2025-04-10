package Ud10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerModoTexto {

	public static void main(String[] args) {
		FileReader entrada = null;
		int car=0;
		try {
			 entrada = new FileReader("fichero.txt");
			while (car!= -1) {
				car=entrada.read();
				System.out.print((char)car);
			}
			
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
