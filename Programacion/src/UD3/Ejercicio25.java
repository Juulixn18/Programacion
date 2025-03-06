package UD3;

public class Ejercicio25 {

	public static void main(String[] args) {
		int años;
		double sueldo, resultadoSueldo;
		sueldo=40000;
		años=3;
		if (años>=10) {
			resultadoSueldo= sueldo * 10/100 ;
			System.out.println(resultadoSueldo);
		}
		else if (años<10&&años>=5) {
			resultadoSueldo= sueldo * 7/100;
			System.out.println(resultadoSueldo);
		}
		else if(años<5&&años>=3) {
			resultadoSueldo= sueldo * 5/100;
			System.out.println(resultadoSueldo);
		}
		else if(años<3) {
			resultadoSueldo= sueldo * 3/100;
			System.out.println(resultadoSueldo);
		}
	}

}
