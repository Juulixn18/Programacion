package Ud10;

public class UsoLibro2 {

	public static void main(String[] args) {
		Libro l1=null;
		try {
			l1= new Libro ("hols","hola",124,-1);
		} catch (CalificacionEnRangoExcepcion e) {
			System.out.println(e.getMessage());
		}
		System.out.println(l1);

	}

}
