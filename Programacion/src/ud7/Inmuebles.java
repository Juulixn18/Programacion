package ud7;

public class Inmuebles {
/*	Un inmobiliaria vende dos tipos de Inmuebles: Pisos y Locales. Para
	cualquier tipo de inmueble, se conoce su dirección y el número de metros
	cuadrados. Además, para los pisos, habrá que conocer el piso concreto en
	el que se encuentra la vivienda, mientras que para los locales importará el
	número de ventanas que tenga. Además, cualquiera de estos inmuebles
	puede ser nuevo o de segunda mano. El precio de cada inmueble se calcula
	a partir de un precio base y una serie de caracter ́ısticas: para cualquier
	inmueble, si tiene menos de 15 años, su precio se rebaja un 1 %, mientras
	que si tiene más se reduce un 2 %. En el caso de los pisos, si es un tercero
	o más, su precio se incrementa un 3 %. Para los locales, si tienen más de
	50 metros cuadrados el precio se incrementa un 1 %, si tienen 1 o ningún
	ventanal, su precio se reduce un 2 % y si tienen más de 4 ventanales se
	añade un 2 %.*/
	
	private String direccion;
	private int nMetros;
	private double precioBase;
	private int añosInmueble;
	
	public Inmuebles(String direccion, int nMetros, double precioBase, int añosInmueble) {
		this.direccion=direccion;
		this.nMetros=nMetros;
		this.precioBase=precioBase;
		this.añosInmueble=añosInmueble;
	}
	
	
}
