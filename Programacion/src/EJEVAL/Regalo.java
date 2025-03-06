package EJEVAL;

public class Regalo {
	private String nombreRegalo=null;
	private double precioRegalo=0;
	private String descripcionRegalo=null;
	
	
	public Regalo(String nombreRegalo, double precioRegalo, String descripcionRegalo) {
		this.nombreRegalo=nombreRegalo;
		this.precioRegalo=precioRegalo;
		this.descripcionRegalo=descripcionRegalo;
	}
	//setters
	
	public void setNombreRegalo(String nombreRegalo) {
		this.nombreRegalo = nombreRegalo;	
	}
	public void setPrecioRegalo(double precioRegalo) {
		this.precioRegalo = precioRegalo;
	}
	public void setDescripcionRegalo(String descripcionRegalo) {
		this.descripcionRegalo = descripcionRegalo;
	}
	
	//getters
	public String getNombreRegalo() {
		return nombreRegalo;
	}
	public double getPrecioRegalo() {
		return precioRegalo;
	}
	public String getDescripcionRegalo() {
		return descripcionRegalo;
	}
	
	//toString
	public String toString() {
		return "\nNombre del regalo: "+nombreRegalo+ "\nPrecio del regalo: "
		+precioRegalo+"€ "+" \nDescripcion del regalo:"+ descripcionRegalo;
	}
}
