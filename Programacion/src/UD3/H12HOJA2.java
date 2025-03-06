package UD3;

public class H12HOJA2 {

	public static void main(String[] args) {
		int n1, n2;
		n1=1;
		n2=20;
		
		if (n1>=n2) {
			System.out.println("error");
		}
		
		while(n1<n2) {
			if((n1%2)==0) {
				System.out.println(n1);
			}
			n1=n1+1;
		}		
	}

}
