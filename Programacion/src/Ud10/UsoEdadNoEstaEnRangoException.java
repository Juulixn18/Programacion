package Ud10;

public class UsoEdadNoEstaEnRangoException {
	
	public static void validarEdad(int edad) throws EdadNoEstaEnRangoException {
		if ((edad<=0)|| (edad>=100)) {
			throw new EdadNoEstaEnRangoException("La edad debe estar comprendida entre ' y 100");
		}
	}
	
	public static void main(String[] args) {
		try {
			validarEdad(-1);
		}catch (EdadNoEstaEnRangoException e) {
			System.out.println(e.getMessage());
		}
	}
}
