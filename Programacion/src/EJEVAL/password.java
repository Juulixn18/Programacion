package EJEVAL;

public class password {

	public static void main(String[] args) {
		String alfabeto="";
		for(char letra='a'; letra<='z'; letra++) {
			alfabeto+=letra;
		}
		System.out.println(alfabeto);
		alfabeto+=alfabeto.toUpperCase();
		System.out.println(alfabeto);
		for(char letra='0'; letra<='9'; letra++) {
			alfabeto+=letra;
		}
		System.out.println(alfabeto);
		String carEspecial="@#$_";
		
	}

}
