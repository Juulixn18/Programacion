package ud8;

public class Profesores extends Persona{
	private String materia;
	
	public Profesores(String edad, String nombre, String sexo, String materia) {
		super(edad, nombre, sexo);
		this.materia=materia;	
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString()+"Profesores [materia=" + materia + "]";
	}
	
}
