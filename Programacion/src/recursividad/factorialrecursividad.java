package recursividad;

public class factorialrecursividad {

	public static void main(String[] args) {
		
		mostrardel1al100(1);
	}
	public static void mostrardel1al100(int n) {
		if (n<=3) { //caso base
			mostrardel1al100(n+1);
			System.out.println(n);
			
		}
	}
}
