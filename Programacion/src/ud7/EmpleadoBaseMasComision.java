package ud7;

public class EmpleadoBaseMasComision extends Empleado{

	private double comisionPorVenta;
	private int numVentas;
	
	public EmpleadoBaseMasComision(String nombre, String apellido, String nSS,
			double comisionPorVenta, int numVentas, double salarioBase) {
		super(nombre, apellido, nSS,0);
		this.comisionPorVenta=comisionPorVenta;
		this.numVentas=numVentas;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	@Override
	public String toString() {
		return super.toString()+"EmpleadoBaseMasComision [comisionPorVenta=" + comisionPorVenta + ", numVentas=" + numVentas + "]"
				+this.calculaSalario();
	}
	public double calculaSalario() {
		return getSalarioBase()+(comisionPorVenta*numVentas);
	}
	
}
