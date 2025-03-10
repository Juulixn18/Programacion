package ud8;

public class Paloma extends Ave{
	private String color;
	
	public Paloma(String especie, boolean vuela, String color) {
		super(especie, vuela);
		this.color=color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString()+"Paloma [color=" + color + "]";
	}

	
	
	
}
