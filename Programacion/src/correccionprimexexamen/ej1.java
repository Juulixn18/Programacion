package correccionprimexexamen;

import java.util.Scanner;

public class ej1 {
//mas de 10 años 10%
	//menos de 10 o 10 mas de 5 7
	//menos de 5 o 5 y mas de 3 5%
	//menos de 3 o 3 3%
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("introduce la antiguedad");
			double antiguedad=in.nextInt();
			double aumento=40000;
			if(antiguedad>10) {
				aumento=aumento+(aumento*0.1);
				System.out.println(aumento);
			}
			if(antiguedad<=10 && antiguedad >5) {
				aumento=aumento+(aumento*0.07);
				System.out.println(aumento);
			}
			if(antiguedad<=5 && antiguedad >3) {
				aumento=aumento+(aumento*0.05);
				System.out.println(aumento);
			}
			if(antiguedad<=3) {
				aumento=aumento+(aumento*0.03);
				System.out.println(aumento);
			}
		}
	}

}
