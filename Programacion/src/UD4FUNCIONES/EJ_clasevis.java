package UD4FUNCIONES;

public class EJ_clasevis {

	public static void main(String[] args) {
		//primer array de 5 posiciones
		int[] nums = { 5, 8, 9, 10, 1 };

		
		int[] numsx2 = doble(nums);

		for (int i = 0; i < 5; i++) {
			System.out.println(numsx2[i]);
		}

	}

	public static int[] doble(int[] nums) {

//		Definimos otro array
		int[] numsdoble = new int[5];

		for (int i = 0; i < 5; i++) {
			numsdoble[i] = 2 * nums[i];
		}

		return numsdoble;
	}

}
