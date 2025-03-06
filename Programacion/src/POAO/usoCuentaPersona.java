package POAO;

public class usoCuentaPersona {

	public static void main(String[] args) {
		Personaaaaa per=new Personaaaaa("5531");
		per.agregarCuentas(new Cuentaa(0, 0));
		per.agregarCuentas(new Cuentaa(1, 500));
		per.agregarCuentas(new Cuentaa(2, 200));
		per.getCuentas()[1].setpagaRecibo(700);
		
		if (per.getsoymoroso()) {
			System.out.println("Moroso");
		}else{
			System.out.println("La persona no es morosa");
		}
	}

}
