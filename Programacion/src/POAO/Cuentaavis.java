package POAO;

public class Cuentaavis {

	private String numCuenta;
	private double saldo;

	public Cuentaavis(String numCuenta) {
		this.numCuenta = numCuenta;
		saldo = 0;
	}

	public void recibirAbono(double abono) {
		saldo += abono;
	}

	public void pagarRecibo(double recibo) {
		saldo -= recibo;
	}

	//getters
	public double consultaSaldo() {
		return saldo;
	}
	public String consltaNumCuenta() {
		return numCuenta;
	}
	
	
}
