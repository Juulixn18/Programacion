package POAO;

public class Cuentaa {
	private int Cuenta;
	private double Saldo;
	
	public Cuentaa(int numcuents, double dinero) {
		Cuenta=numcuents;
		Saldo=dinero;
	}
	
	//getters
	public int getCuenta() {
		return Cuenta;
	}
	public double getSaldo() {
		return Saldo;
	}
	
	//Setters

	public void setrecibeBono(double s) {
		Saldo+=s;	
	}
	public void setpagaRecibo(double s) {
		Saldo-=s;	
	}
	
}
