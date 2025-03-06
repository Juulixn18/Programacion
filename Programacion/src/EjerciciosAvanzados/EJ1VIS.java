package EjerciciosAvanzados;

public class EJ1VIS {

	public static void main(String[] args) {
		int num=153;
		int u, d, c;
		u=num%10;
		num=num/10;
		d=num%10;
		num=num/10;
		c=num;
		System.out.println(c+ ","+d+ ","+u);

	}

}
