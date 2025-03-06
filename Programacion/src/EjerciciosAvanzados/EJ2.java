package EjerciciosAvanzados;

public class EJ2 {

	public static void main(String[] args) {
		int  sumadivisores;
		sumadivisores=0;
		double n;
		n=28;
		//En el bucle incrementamos el divisor para ir comporbando
		//todos los posibles y los vamos sumando y guardando
		for (int i=0; i<n; i++) {
			if (n%i==0) {
				sumadivisores=sumadivisores+i;
				
			}
		}
		//si la suma de los divisores sin incluir el numero entero
		//es igual al numero entero es un numero perfecto
		if (sumadivisores==n) {
			System.out.println(n+" Es un numero perfecto");
		}else {
			System.out.println(n+" No es un numero perfecto");
		}
				
	}

}