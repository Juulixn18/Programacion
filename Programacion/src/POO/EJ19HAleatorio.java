package POO;

import java.util.Random;

public class EJ19HAleatorio {

	public static void main(String[] args) {
		Random random=new Random();

		for (int i = 0; i < 10; i++) {
		String cadena="";
			for (int j = 0; j < 5; j++) {
				cadena=cadena+(char)(random.nextInt(26)+97);
			}
			System.out.println(cadena);

		}

	}

}
