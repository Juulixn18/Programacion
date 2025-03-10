package ud8;

public class Coche extends Automovil{
	
	private int ruedas, puertas;
	
	
	public Coche(String matricula, String color, int anyo, double precioCompra, int ruedas, int puertas) {
		super(matricula, color, anyo, precioCompra);
		this.ruedas = ruedas;
		this.puertas = puertas;
	}


	@Override
	public double calculaPrecio() {
		if (this.getAnyo()>2015) {
			return this.getPrecioCompra();
		}
		return this.getPrecioCompra()/2;
		
	}

}
