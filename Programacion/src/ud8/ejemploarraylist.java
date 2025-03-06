package ud8;

import java.util.ArrayList;

public class ejemploarraylist {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		//usamos la coleccion
		numero.add(3);
		numero.add(19);
		numero.add(7);
		numero.add(9);
		numero.add(6);
		numero.add(1);
		System.out.println(numero);
		numero.remove(1);
		System.out.println(numero);
		System.out.println(numero.contains(1));
		
		for (int i = 0; i < numero.size(); i++) {
			int num=numero.get(i);
			System.out.println("Valor: "+num);
			System.out.println("Esta en la posicio: "+numero.indexOf(num));
		}
		
		numero.set(0, 55);
		System.out.println(numero);
	}
	
}