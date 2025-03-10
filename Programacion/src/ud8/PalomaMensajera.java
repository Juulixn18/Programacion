package ud8;

public class PalomaMensajera extends Paloma{
	private int velocidad;
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public PalomaMensajera(String especie, boolean vuela, String color, int velocidad) {
		super(especie, vuela, color);
		this.velocidad=velocidad;
	}
	@Override
	public String toString() {
		return super.toString()+"PalomaMensajera [velocidad=" + velocidad + "]";
	}

	
}
