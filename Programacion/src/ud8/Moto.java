package ud8;

public class Moto  extends Automovil{
	private int cilindrada;
	public Moto(String matricula, String color, int anyo,
			double precioCompra, int cilindrada) {
		super(matricula, color, anyo, precioCompra);
		this.cilindrada=cilindrada;
	}
	@Override
	public double calculaPrecio() {
		return this.getPrecioCompra()/2;
	}
	

	
}
