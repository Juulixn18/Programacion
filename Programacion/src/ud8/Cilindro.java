package ud8;

public class Cilindro extends Figura{

	private Circulo c;
	private double h;
	
	public Cilindro(String n,Circulo c, double h) {
		super(n);
		this.c=c;
		this.h=h;
	}

	@Override
	public double obtenerArea() {
		// TODO Auto-generated method stub
		return (2*c.obtenerArea())+(h*2*Math.PI*c.getRadio());
	}

	@Override
	public double obtenerVolumen() {
		// TODO Auto-generated method stub
		return h*c.obtenerArea();
	}
	public boolean equals(Object o) {
		if ((o==null) || (this==null))
			return false;
		if(!(o instanceof Cilindro))
			return false;
		Cilindro cAux=(Cilindro) o;
		return (this.c.obtenerArea()==cAux.obtenerArea()&&this.c.obtenerVolumen()==cAux.obtenerVolumen());	
	}
	
}