package UD4_Array;

public class EJ11_array {

	public static void main(String[] args) {
		int [] num = new int [100];
		
		int k=0, j=1;
		for (int i=1; i<=200; i++) {
			if (i%2==0) {
				k++;
				num[k-1]=i;
			}
			
		}
//		while(k<num.length) {
//			if (j%2==0) {
//				num[k]=j;
//				k++;
//				
//			}
//			j++;
//		}
		
		int result=0;
		for (int i=0; i<num.length; i++) {
			result=result+num[i];
			System.out.println(result);
		}
		
		}
		
	}


