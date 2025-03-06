package RepasoExamen;

public class Libro {
	private String titulo, autor;
	private int numPag;
	private double calificacion;
	public Libro(String titulo, String autor, int numPag, double Calificacion) {
		this.titulo=titulo;
		this.autor=autor;
		this.numPag=numPag;
		this.calificacion=calificacion;
		
	}
	public void setCalificacion(double calificacion) {
		if (calificacion>=0 && calificacion<=10) {
			this.calificacion=calificacion;
		}
		else {
			this.calificacion=0;
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public double getCalificacion() {
		return calificacion;
	}
}
