package POAO;

import java.util.Scanner;

public class usoReloj {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Tiempo t1=new Tiempo(in.nextInt(),in.nextInt(),in.nextInt());
		Tiempo t2=new Tiempo(12,12);
		Tiempo t3=new Tiempo(12);


		System.out.println(t1.getTiempo());
		System.out.println(t2.getTiempo());	
		System.out.println(t3.getTiempo());
		
		

	}

}
