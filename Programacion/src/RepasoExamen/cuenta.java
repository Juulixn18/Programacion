package RepasoExamen;

public class cuenta {
	private String titular;
	private double cantidad;
	public cuenta (String titular, double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	public void titular() {
		System.out.println("El titular es "+titular);
	}
	public void cantidad() {
		System.out.println("La cantidad es "+cantidad);
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	public void setCantidad(double cantidad) {
		this.cantidad=cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setIngreso(double cantidad) {
		if (cantidad<0) {
			System.out.println();
		}else {
			this.cantidad+=cantidad;
		}
	}
	public void setRetiro(double cantidad) {
		this.cantidad-=cantidad;
		if (this.cantidad<0) {
			this.cantidad=0;
		}
	}
	public String toString() {
		return "El titular es: "+titular+" la cantidad es: "+ cantidad;
	}
}
