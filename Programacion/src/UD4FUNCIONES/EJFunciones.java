package UD4FUNCIONES;

public class EJFunciones {
	
	//funcion principal: en todo programa tiene que haber una y 
	//solo una funcion principal para que funcione 
	public static void main(String[] args) {
		double num1=3;
		double num2=2;
		//llamamos a la funcion
		suma(num1, num2);
		double resultado=0;
		resultado=suma(num1, num2);
		System.out.println("El resultado es "+resultado);

	}
	//DEFINIMOS LA FUNCIO SUMA
	//cabecera de la funcion suma
	public static double suma (double a, double b) {
		//cuerpo de la funcion
		double resultado=a+b;
		return resultado;
	}

}
