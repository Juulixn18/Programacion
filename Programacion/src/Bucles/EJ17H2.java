package Bucles;

public class EJ17H2 {

	public static void main(String[] args) {
		int i;
		i=1;
		/*k=1;
		while (i<=10) 
		{
			while(k<=10) 
			{
				System.out.print();
				k++;
			}
			System.out.println("");
			k=0;
			i++;
		}*/
		while (i<100) {
			System.out.print(i+" ");
			i++;
			if (i%10==0) {
				System.out.println(i);
				i++;
			}
		}
	}

}
