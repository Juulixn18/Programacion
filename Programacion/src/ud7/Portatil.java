package ud7;

public class Portatil extends Ordenador {
	private int duracionBateria;

	// constuctor
	public Portatil(String numSer, String proc, 
		   String mem, String tamPant, int durBat) {

		// llamamos al constructor
		super(numSer, proc, mem, tamPant);

		this.duracionBateria = durBat;

	}

	public int getDuracionBateria() {
		return duracionBateria;
	}

	public void setDuracionBateria(int duracionBateria) {
		this.duracionBateria = duracionBateria;
	}


	public String toString() {
		return super.toString()+"Portatil [duracionBateria=" + duracionBateria + "]";
	}
	
}
