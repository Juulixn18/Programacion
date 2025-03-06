package ud7;

public class usoFacultad {

	public static void main(String[] args) {
		Persona[] persona = new Persona[3];
		persona[0] = new Profesores("a", "a", "12a", "soltero ", 1999, 1, "fol");
		persona[1] = new Estudiantes("b", "b", "34b", "soltero ", 2);
		persona[2] = new Personal("c", "c", "56c", "casado ", 2000, 2, "Limpieza");

		for (int i = 0; i < persona.length; i++) {
			//objeto instanceof Clase : devuelve true si el objeto pertenece a la clase
			// y false en caso contrario
			if (persona[i] instanceof Estudiantes) {
				//casting o forzado de tipo para hacer que la persona se comporte como
				//Estudiante y asi poder acceder a sus metodos
				((Estudiantes) persona[i]).setCurso(2026);
			}
			System.out.println(persona[i].toString());
		}

	}

}
