package Bucles;

public class EJ9HojaBucles {

	public static void main(String[] args) {
		
		int i, k;
		i=0;
		k=i;
		
		while (i<100) {
			if ((i%2)==0) {
			i=i+1;
			k=k+i;
			
			}else {
			i=i+1;
			k=k+1;
			}
			System.out.println(k);
		}
		
	}

}
