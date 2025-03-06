package ud8;

public class Alumno extends Persona {
	private int calificacion;

	public Alumno(String nombre, String edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;

	}
	public void setCalificacion(int calificacion) {
		this.calificacion=calificacion;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	public String toString() {
		return super.toString()+" Calificacion: "+calificacion;
	}
}
