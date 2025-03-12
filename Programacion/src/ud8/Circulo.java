package ud8;


public class Circulo extends Figura {

	private Punto p;
	private double r;
	public Circulo(String n, Punto p, double r) {
		super(n);
		this.p=p;
		this.r=r;
	}
	@Override
	public double obtenerArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	@Override
	public double obtenerVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Punto getPunto() {
		return p;
	}
	public double getRadio() {
		return r;
	}
	public boolean equals(Object o) {
		if ((o==null) || (this==null))
			return false;
		if(!(o instanceof Circulo))
			return false;
		Circulo cirAux=(Circulo) o;
		return (this.p.obtenerArea()==cirAux.obtenerArea());	
	}

}