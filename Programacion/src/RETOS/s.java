package RETOS;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		if (dentroDerango(num)==true) {
			multnum(num) ;
		}else {
			
		}
	}
	public static boolean dentroDerango(int num) {
		if (num>=0 && num<=10) {
			return true;
		}
		return false;
	}
	public static void multnum(int num) {
		for (int i=0; i<=10; i++) {
			System.out.println(i*num);
		}
	}

}
