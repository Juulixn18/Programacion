package ud7;

public class Estudiantes extends Persona{
	private int curso;
	
	public Estudiantes(String nombre, String apellidos,
		   String dni, String estado_civil, int curso) {	
		super(nombre, apellidos, dni, estado_civil);
		this.curso=curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	
	public String toString() {
		return super.toString()+"Curso=" + curso ;
	}
	
	
}
