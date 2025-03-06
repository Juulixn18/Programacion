package Bucles;

import java.util.Scanner;

public class EJ2HojaBucles 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n = entrada.nextInt();
		int i, primo = 0;
		if (n > 0) 
		{
			for (i = 1; i <= n; i++) 
			{
				if (n % i == 0) 
				{
					primo = primo + 1;
				}
				
			}
			if (primo <= 2) 
			{
				System.out.println(n + " Es primo");
			}else {
				System.out.println(n+ " No es primo");
			}
		}

	}

}
