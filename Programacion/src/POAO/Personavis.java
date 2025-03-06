package POAO;

public class Personavis {

	// atributos
	private String DNI;
	// int [] nums
	private Cuentaavis[] cuentas;
	private int numCuentas;

	// Constructor
	public Personavis(String DNI) {
		this.DNI = DNI;
		cuentas = new Cuentaavis[3];
		numCuentas = 0;
	}

	public boolean añadirCuenta(String numC) {
		if (numCuentas < 3) {
			Cuentaavis c = new Cuentaavis(numC);
			cuentas[numCuentas] = c;
			return true;
		}
		return false;
	}

	public boolean esMorosa() {
		for (int i = 0; i < numCuentas; i++) {
			Cuentaavis c = cuentas[i];
			if (c.consultaSaldo() < 0)
				return true;
		}
		return false;
	}
	public Cuentaavis dameCuenta(String numCuenta) {
		for (int i=0; i<numCuentas; i++) {
			Cuentaavis c = cuentas[i];
			if(c.consltaNumCuenta().equals(numCuenta))
				return c;
		}
		return null;
	}
	public String toString() {
		String cad="Dni:"+DNI;
		for(int i=0;i<numCuentas;i++) {
			cad+=cuentas[i].toString();
		}
		return cad;
	}
	
	
/*
	public Cuentaavis dameCuenta(int num) {
		if (num>=0&&num < 3)
			return cuentas[num];
		else
			return null;
	}*/
}
