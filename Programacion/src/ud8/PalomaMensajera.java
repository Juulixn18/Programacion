package ud8;

public class PalomaMensajera extends Paloma implements Comunicador{
	private int velocidad;
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public PalomaMensajera( boolean vuela, String color, int velocidad) {
		super("Mensajera", true, "Gris");
		this.velocidad=velocidad;
	}
	@Override
	public String toString() {
		return super.toString()+"PalomaMensajera [velocidad=" + velocidad + "]";
	}
	
	public void enviaMensaje(String mensaje) {
		System.out.println("Soy una paloma "+ Comunicador.CTE + 
				" y llevo el mensaje");
	}

	
}
