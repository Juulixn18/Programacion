package UD4_Arraybidimensionales;

public class EJ16HOJA4 {

	public static void main(String[] args) {
		int [][]numeros=new int [10][10];

		for (int i=0; i<numeros.length; i++) {
			System.out.println();
			for (int j=0; j<numeros.length; j++) {
				numeros[i][j]=(i*10)+j+1;
				System.out.print(numeros[i][j]+" ");
			}
		}

	}

}
