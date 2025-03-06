package Bucles;

public class EJ21HojaBucles {

	public static void main(String[] args) {
		int n, i, fact;
		n=4;
		i=1;
		fact=1;
		if(n==0) {
			System.out.println("es 0");
		}
		if(n<0) {
			System.out.println("no vale");
		}
		
		while (i<=n) {
			fact=fact*i;
			i=i+1;
			System.out.println(fact);
		}
		

	}

}
