package POAO;

public class usarRaices {

	public static void main(String[] args) {
		Raices r1=new Raices(1,-6,9); //1 sol
		Raices r2=new Raices(1,0,4);//0 sol
		Raices r3=new Raices(1,0,-4);//2 sol
		r1.calcular();
		r2.calcular();
		r3.calcular();
	}

}
