package POAO;

public class Libro {
	private String autor;
	private String titulo;
	private int numPaginas;
	private double calificacion;
	
	

	//Constructores
	public Libro(String titulo, String autor,int numpaginas, double calificacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas=numpaginas;
		this.calificacion = calificacion;
	}
//////////////////////////////////////////////////////////////
//	public Libro(String titulo, String autor,int numpaginas) {
//		this.titulo = titulo;
//		this.autor = autor;
//		this.numPaginas=numpaginas;
//		this.calificacion = 0;
//	}
//
//	public Libro(String titulo,String autor) {
//		this.titulo = titulo;
//		this.autor = "";
//		this.calificacion = 0;
//	}
////////////////////////////////////////////////////////////////	
	
	//setters

	public void setNota(double calificacion) {
		this.calificacion = calificacion;
	}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}	
	
	public String toString() {
		return "El titulo es: "+this.titulo+"\n"+"El autor es: "
		+this.autor+"\n"+"El numero de paginas: "+this.numPaginas+"\n"
		+"La calificacion: "+this.calificacion+"\n";
	}
	//getters
	public String getconsultaLibro() {
		return this.titulo+this.autor;
	}
	public String getconsultaTitulo() {
		return this.titulo;
	}
	public String getconsultaAutor() {
		return this.autor;
	}
	public double getconsultaNota() {
		return this.calificacion;
	}
}
