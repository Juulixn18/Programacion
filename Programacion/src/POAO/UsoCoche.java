package POAO;

public class UsoCoche {

	public static void main(String[] args) {
		//nombreClase
		Coche renault=new Coche();
		//usamos el objeto
		//nombre del objeto.metodo
		renault.arrancar(); renault.acelerar();
		renault.cambiaColor("azul");
		System.out.println(renault.dameColor());
	}

}
