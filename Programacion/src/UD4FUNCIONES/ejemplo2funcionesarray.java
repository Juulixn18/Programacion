package UD4FUNCIONES;
//CASO 2: sobreescribo el array
public class ejemplo2funcionesarray {

	public static void main(String[] args) {
		int [] numeros= {2,5,10}; 
		multiplicax2(numeros);
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	public static void multiplicax2(int [] nums) {
		for (int i=0; i<nums.length; i++) {
			nums[i]=2*nums[i];
			
		}
		
	}

}
