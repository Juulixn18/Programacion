package Ud10;

import java.io.FileReader;
import java.io.FileWriter;


public class EjerciciosFicherosDeTexto {
	public static void main(String[] args) {
	}
	public static void copiaFicherosDeTexto(String fichOrigen, String fichDestino) {
		throws IOException{
			FileReader in = new FileReader(fichOrigen);
			String contenidoFichero="";
			int car=0;
			while (car!=-1) {
				car=in.read();
				contenidoFichero+=(char)car;
			}
			in.close();
			FileWriter out=new FileWriter(fichDestino);
			out.write(contenidoFichero);
			out.close();
			
		}
	}
}

	
