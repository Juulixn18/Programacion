package EJEVAL;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysyFunciones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double [] numeros= new double [5];
		double suma;
		double resta;
		double mult;
		double div;
		double promedio;
		double maximo;
		double minimo;
		double []sumacum= new double[5];
		System.out.println("Dame  numeros");
		for (int i=0; i<numeros.length; i++) {
			numeros[i]=sc.nextInt();
		}
		System.out.println("Que numero quieres verificar si esta dentro del array");
		double num=sc.nextDouble();
		System.out.println("Suma:");
		System.out.println(suma=sumarElementos(numeros));
		System.out.println("resta:");
		System.out.println(resta=restarElementos(numeros));
		System.out.println("mult:");
		System.out.println(mult=multiplicarElementos(numeros));
		System.out.println("div:");
		System.out.println(div=dividirElementos(numeros));
		System.out.println("Maximo:");
		System.out.println(maximo=encontrarMaximo(numeros));
		System.out.println("Minimo:");
		System.out.println(minimo=encontrarMinimo(numeros));
	//	buscarNumero(numeros, num);
		System.out.println("Suma acumulada");
		sumacum=sumaAcumulada(numeros);
		
		for (int i = 0; i < sumacum.length; i++) {
			System.out.println(sumacum[i]);
		}
		System.out.println("Promedio");
		System.out.println(promedio=calcularPromedio(numeros));
	}
	public static double sumarElementos(double[] array) {
		
		double acum = 0;
		for (int i = 0; i < array.length; i++) {
			acum+=array[i];

		}
		return acum;

	}
	public static double restarElementos(double[] array) {
		double acum=0;
		for (int i = 0; i < array.length; i++) {
			acum-=array[i];
		}
		return acum;
	}
	public static double multiplicarElementos(double[] array) {
		double acum =1;
		for (int i = 0; i < array.length; i++) {
			acum*=array[i];

		}
		return acum;
	}
	public static double dividirElementos(double[] array) {
		double acum =1;
		for (int i = 0; i < array.length; i++) {
			acum/=array[i];

		}
		return acum;
	}
	public static double calcularPromedio(double[] array) {
		double acum =1;
		int i;
		for ( i = 0; i < array.length; i++) {
			acum+=array[i];

		}
		acum=acum/i;
		return acum;
	}
	public static double encontrarMaximo(double[] array) {
		double acum =0;
		for (int i = 0; i < array.length; i++) {
			if(array[0]>array[1]&&array[0]>array[2]&&array[0]>array[3]&&array[0]>array[4]) {
				acum=array[0];
			}
			if(array[1]>array[0]&&array[1]>array[2]&&array[1]>array[3]&&array[1]>array[4]) {
				acum=array[1];
			}
			if(array[2]>array[0]&&array[2]>array[1]&&array[2]>array[3]&&array[2]>array[4]) {
				acum=array[2];
			}
			if(array[3]>array[0]&&array[3]>array[1]&&array[3]>array[2]&&array[3]>array[4]) {
				acum=array[3];
			}
			if(array[4]>array[0]&&array[4]>array[1]&&array[4]>array[2]&&array[4]>array[3]) {
				acum=array[4];
			}

		}
		return acum;
	}
	public static double encontrarMinimo(double[] array) {
		double acum =0;
		for (int i = 0; i < array.length; i++) {
			if(array[0]<array[1]&&array[0]<array[2]&&array[0]<array[3]&&array[0]<array[4]) {
				acum=array[0];
			}
			if(array[1]<array[0]&&array[1]<array[2]&&array[1]<array[3]&&array[1]<array[4]) {
				acum=array[1];
			}
			if(array[2]<array[0]&&array[2]<array[1]&&array[2]<array[3]&&array[2]<array[4]) {
				acum=array[2];
			}
			if(array[3]<array[0]&&array[3]<array[1]&&array[3]<array[2]&&array[3]<array[4]) {
				acum=array[3];
			}
			if(array[4]<array[0]&&array[4]<array[1]&&array[4]<array[2]&&array[4]<array[3]) {
				acum=array[4];
			}

		}
		return acum;
	}
	public static double[] sumaAcumulada(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]+=array[i]+array[i];
		}
		return array;
	}
	/*public static double[] invertirArray(double[] array) {
		
	}
	public static boolean buscarNumero(double[] array, double numero) {
		
		for (int i = 0; i < array.length; i++) {
			if(numero==array[i]) {
				return true;
			}
			
		}
		
	}*/
}
