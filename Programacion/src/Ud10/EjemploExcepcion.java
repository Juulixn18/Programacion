package Ud10;

public class EjemploExcepcion {
	public static int multiplica(int a, int b)throws ArithmeticException{
		int rsdoEntero=a*b;
		double rsdoDouble=(double)a*(double)b;
		if (((double)a>Integer.MAX_VALUE)||((double)a<Integer.MIN_VALUE)){
			throw new ArithmeticException("Number overflow");
		}
		return rsdoEntero;
		
	}
	public static void main(String[] args) {
		try {
			System.out.println(multiplica(5,2));
			System.out.println(multiplica(1, Integer.MIN_VALUE+1));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
