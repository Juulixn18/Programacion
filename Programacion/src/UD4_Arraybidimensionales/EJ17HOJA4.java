package UD4_Arraybidimensionales;

public class EJ17HOJA4 {
	public static void main(String[] args) {
		int [][]numeros=new int [11][10];
		
		for (int i=0; i<numeros.length-1; i++) {
			
			for (int j=0; j<numeros.length-1; j++) {
				numeros[i][j]=(i*10)+j+1;
			
				System.out.print(numeros[i][j]+" " );
				
			}
			System.out.println();
			
		}
		for (int i = 0; i < numeros.length-1; i++) {
			int acum=0;
			for (int j = 0; j < numeros.length-1; j++) {
				acum+=numeros[j][i];
			}
			numeros[numeros.length-1][i]=acum;
			System.out.print(numeros[10][i]+" ");
		}
	}
}
