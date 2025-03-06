package POO;

import java.util.Scanner;

public class codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int npalabras=in.nextInt();

		String  palabras="";
		for (int i=0; i<=npalabras; i++) {
			palabras=in.nextLine();
			if(palabras.length()>10) {
				System.out.println(palabras.charAt(0)+""+(palabras.length()-2)+""+palabras.charAt(palabras.length()-1));
			}else {
				System.out.println(palabras);
			}
		}

		

		
	}

}
