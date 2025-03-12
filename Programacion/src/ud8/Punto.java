package ud8;

public class Punto extends Figura {
	private double x,y;
	
	public Punto(String n, double x, double y) {
		super(n);
		this.x=x;
		this.y=y;
	}

	@Override
	public double obtenerArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double obtenerVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object o) {
		if ((o==null) || (this==null))
			return false;
		if(!(o instanceof Punto))
			return false;
		Punto pAux=(Punto) o;
		return (this.x==pAux.getX()&&this.y==pAux.y);
		
		
			
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}