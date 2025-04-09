package Ud10;

public class Libro {
	private String titulo, autor;
	private int numPags, calif;
	
	public Libro(String tit, String aut, int npgs, int cal) throws CalificacionEnRangoExcepcion{
		titulo=tit;
		autor=aut;
		numPags=npgs;
		validarCalificacion(cal);
		calif=cal;
		
		
	}
	private void validarCalificacion (int cal) throws CalificacionEnRangoExcepcion{
		if (cal<0 || cal>10) {
			throw new CalificacionEnRangoExcepcion("La calificacion no esta en el rango");	
		}
	}
	//setter
	public void setCalificacion(int newCalif)throws CalificacionEnRangoExcepcion {
		validarCalificacion(newCalif);
		calif=newCalif;
	}
	
	//getter
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String toString() {
		return "titulo:"+titulo+" autor:"+autor+" numPags:"+
				numPags+" calif:"+calif;
	}
	

}
