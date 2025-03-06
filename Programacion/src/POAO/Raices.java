package POAO;

public class Raices {
	private double a, b, c;
	
	public Raices(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public double getDiscrimiante() {
		return (b*b)-(4*a*c);
	}
	
	public void obtenerRaices() {
		double discrim=getDiscrimiante();
		double sol1=(-b+Math.sqrt(discrim))/2*a;
		double sol2=(-b-Math.sqrt(discrim))/2*a;
		System.out.println(sol1);
		System.out.println(sol2);
	}
	public void obtenerraiz() {
		System.out.println(-b/2*a);
	}
	public boolean tieneRaices() {
		return getDiscrimiante()>0;
	}
	public boolean tieneRaiz() {
		return getDiscrimiante()==0;
	}
	public void calcular() {
		if (tieneRaiz()) {
			obtenerraiz();
		}
		else if (tieneRaices()) {
			obtenerRaices();
		}else {
			System.out.println("No tiene raices reales");
		}
	}
	
}
