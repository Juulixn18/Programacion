package POAO;

public class usoPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		if(p1.calculaIMC()==p1.PESOIDEAL) {
			System.out.println("Estas en el peso ideal");
		}
		Persona p2=new Persona();
		System.out.println(p2.toString());
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
	}

}
