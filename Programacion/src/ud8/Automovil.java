package ud8;

public abstract class Automovil {

	private String matricula, color;
	private int anyo;
	private double precioCompra;
	
	public Automovil(String matricula, String color, int anyo, double precioCompra) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.anyo = anyo;
		this.precioCompra = precioCompra;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public int getAnyo() {
		return anyo;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public abstract double calculaPrecio() {
		
	}
	
}
