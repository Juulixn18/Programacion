package Bucles;

public class EJ18HojaBucles {

	public static void main(String[] args) {
		int i, j, result;
		i=0;
		j=0;
		result= i * j;
		while (i<=10) {
			System.out.println("Tabla del "+i);
			
			while (j<=10) {
				result=i*j;
				System.out.println(i+ " * " +j+ " = " +result);
				j++;
				
			}
			j=0;
			i++;
			
		}
		
	}

}
