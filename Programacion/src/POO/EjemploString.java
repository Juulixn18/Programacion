package POO;

public class EjemploString {

	public static void main(String[] args) {
		String cad="Hola a todas";
		for (int i =0; i<cad.length(); i++) {
			char car=cad.charAt(i);
			System.out.println(car);
		}
		//imprimo la cadena en mayusculas
		System.out.println(cad.toUpperCase());
		cad=cad.toUpperCase();
		System.out.println(cad);
		String cad2="Hola a todas";
		if (cad.equals(cad2)) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		
	}

}
