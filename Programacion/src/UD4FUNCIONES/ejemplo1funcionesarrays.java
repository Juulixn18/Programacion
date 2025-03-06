package UD4FUNCIONES;
//CASO 1: Mantengo el array original
public class ejemplo1funcionesarrays {

	public static void main(String[] args) {
		int [] numeros= {2,5,10};
		int [] numerosx2=multiplicax2(numeros);
		//muestro el contenido del array multiplicado
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numerosx2[i]);
		}

	}
	public static int [] multiplicax2(int [] nums) {
		int [] numsx2=new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			numsx2[i]=2*nums[i];
		}
		return numsx2;
	}

}
