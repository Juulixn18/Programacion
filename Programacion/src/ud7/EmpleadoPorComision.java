package ud7;

public class EmpleadoPorComision  extends Empleado{

	private int numVentas;
	private double comisionPorVenta;
	
	public EmpleadoPorComision(String nombre, String apellido, String nSS, double comisionPorVenta, double comisionPorVentas) {
		super(nombre, apellido, nSS, 0);
		this.comisionPorVenta=comisionPorVentas;
		this.numVentas=numVentas;
		
	}
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas=numVentas;
	}

	@Override
	public String toString() {
		return super.toString()+"EmpleadoPorComision [numVentas=" + numVentas + ", comisionPorVenta=" + comisionPorVenta + "]"
				+this.calculaSalario();
	}
	public double calculaSalario() {
		return comisionPorVenta*numVentas;
	}
	
}
