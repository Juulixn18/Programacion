package RepasoExamen;

public class usoCuenta {

	public static void main(String[] args) {
		cuenta p1 = new cuenta("Julian", 100);
		p1.setIngreso(1000);
		System.out.println(p1.toString());
		p1.setRetiro(10000);
		System.out.println(p1.toString());

	}

}
