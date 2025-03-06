package POAO;

import java.util.Iterator;

public class ejemploForEach {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		for (String cad: args) {
			System.out.println(cad);
		}

	}

}
