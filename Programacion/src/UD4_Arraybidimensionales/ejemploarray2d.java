package UD4_Arraybidimensionales;

public class ejemploarray2d {

	public static void main(String[] args) {
		int [][] tablero2= {{5, 2, 7},{9, 11, 25}};
		for (int i=0; i<tablero2.length; i++) {
			for (int j=0; j<tablero2.length; j++) {
				System.out.println();
				System.out.print(tablero2[i][j]+" ");
			}
		}
	}

}
