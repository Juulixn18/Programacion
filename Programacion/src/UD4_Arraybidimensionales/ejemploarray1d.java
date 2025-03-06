package UD4_Arraybidimensionales;

public class ejemploarray1d {

	public static void main(String[] args) {
		int [][] tablero = new int [4][3];
		System.out.println("hola");
		tablero [1][1]=11;
		tablero [3][2]=5;
		for (int i=0; i<4; i++) {
			System.out.println();
			for (int j=0; j<3; j++) {
				System.out.print(tablero[i][j] +" ");
			}
		}
	}

}
