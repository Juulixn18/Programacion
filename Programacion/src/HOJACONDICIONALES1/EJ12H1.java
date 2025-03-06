package HOJACONDICIONALES1;

public class EJ12H1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1=3;
		n2=2;
		n3=1;
		
		if (n1==n2 || n1==n3 || n2==n3 ) {
			System.out.println("error");
		}
		if (n1<n2&&n2<n3) {
			System.out.println("los valores son correctos");
		}
		if (n1<n3&&n3<n2) {
			System.out.println("los valores son correctos");
		}
		if (n2<n1&&n1<n3) {
			System.out.println("los valores son correctos");
		}
		if (n2<n3&&n3<n1) {
			System.out.println("los valores son correctos");
		}
		if (n3<n1&&n1<n2) {
			System.out.println("los valores son correctos");
		}
		if (n3<n2&&n2<n1) {
			System.out.println("los valores son correctos");
		}
		
		
	}

}
