package POAO;

import java.util.Random;
import java.util.Scanner;

public class UsoRectangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		Rectangulo r1=new Rectangulo(3,4);
//		System.out.println("Perimetro: "+r1.perimetro());
		System.out.println(r1.area());
		
	}

}
