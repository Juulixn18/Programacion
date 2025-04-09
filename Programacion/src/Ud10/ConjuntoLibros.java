package Ud10;

public class ConjuntoLibros {
	private Libro[] libros;
	private final int TAM=10;
	private int numLibros;
	
	public ConjuntoLibros() {
		libros=new Libro[TAM];
		numLibros=0;
	}
	
	public boolean agregaLibro(Libro libro) {
		if (numLibros>=TAM) { //libreria llena
			return false;
		}
		if (!libroNoExiste(libro)) { //el libro existe
			return false;
		}
		
		//si llego aqui quiere decir:1) Tengo espacio y 
		//		2)el libro no existe
		for(int i=0;i<TAM;i++) {
			if (libros[i]==null) {
				libros[i]=libro;
				numLibros++;
				return true;
			}
		}
		return true;
	}
	private boolean libroNoExiste(Libro libro) {
		for (int i=0;i<TAM;i++) {
			if (libros[i]!=null) {
				String autor=libros[i].getAutor();
				String tit=libros[i].getTitulo();
				if (libro.getAutor().equals(autor) &&
						libro.getTitulo().equals(tit)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean eliminarLibroPortitulo(String tit) {
		boolean libroEliminado=false;
		for (int i=0;i<TAM;i++) {
			if (libros[i]!=null) {
				if (libros[i].getTitulo().equals(tit)) {
					libros[i]=null;
					numLibros--;
					libroEliminado=true;
				}
			}
		}
		return libroEliminado;
	}
	/*
	public Libro libroConMayorCalificacion() {
		int posMayor=dondeEstaElprimerLibro();
		if (posMayor==-1) {
			return null;
		}
		for (int i=posMayor;i<TAM;i++) {
			
		}
	}
	private int dondeEstaElprimerLibro() {
		for (int i=0;i<TAM;i++) {
			if (libros[i]!=null) {
				return i;
			}
		}
		return -1; // la libreria está vacia;
	}*/
	
	
	
	
}
