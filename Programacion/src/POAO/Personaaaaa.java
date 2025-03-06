package POAO;

public class Personaaaaa {

	private String DNI;
	private Cuentaa[] cuentas=new Cuentaa [3];
	
	//Constructor
	public Personaaaaa(String dni) {
		DNI=dni;
	}
	
	//Getters
	
	public String getDni() {
		return DNI;
		
	}
	public Cuentaa[] getCuentas() {
		return cuentas;
		
	}
	
	public boolean getsoymoroso() {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i]!=null) {
				if (cuentas[i].getSaldo()<0) {
					return true;
				}
			}
		}
		return false;
	}
	public void agregarCuentas(Cuentaa nuevacuenta) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i]==null) {
				cuentas[i]=nuevacuenta;
				return;
			}
		}
	}
	
}
