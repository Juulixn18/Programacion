package ud8;

public class Aula {
	
	private String id, materiaAsociada;
	private int nMaxEstudiantes;
	
	public Aula(String id, String materiaAsociada, int nMaxEstudiantes) {
		this.id=id;
		this.materiaAsociada=materiaAsociada;
		this.nMaxEstudiantes=nMaxEstudiantes;
		
	}

	public String getId() {
		return id;
	}

	public String getMateriaAsociada() {
		return materiaAsociada;
	}

	public int getnMaxEstudiantes() {
		return nMaxEstudiantes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMateriaAsociada(String materiaAsociada) {
		this.materiaAsociada = materiaAsociada;
	}

	public void setnMaxEstudiantes(int nMaxEstudiantes) {
		this.nMaxEstudiantes = nMaxEstudiantes;
	}
	
}
