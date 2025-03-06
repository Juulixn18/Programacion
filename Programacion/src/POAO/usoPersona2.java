package POAO;

public class usoPersona2 {

	public static void main(String[] args) {
		Personavis persona = new Personavis("123a");
		
		persona.añadirCuenta("001");
		
		persona.dameCuenta("001").recibirAbono(100);
		persona.dameCuenta("001").pagarRecibo(25);
		
		double saldo=persona.dameCuenta("001").consultaSaldo();
		System.out.println(saldo);
		System.out.println(persona.toString());
		

	}

}
