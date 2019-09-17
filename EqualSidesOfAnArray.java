package Pruebas;

public class EqualSidesOfAnArray {
	public static int findEvenIndex(int[] arr) {
		int leftSideSum = 0;
		int totalSum = 0;
		// First I sum the whole array:
		for (int x = 0; x < arr.length; x++) {
			totalSum += arr[x];
		}
		// Now I substract the number in every position to sum, till the sum is equal to
		// the result of this substraction:
		for (int x = 0; x < arr.length; x++) {
			totalSum -= arr[x];
			if (leftSideSum == totalSum) {
				return x;

			}
			leftSideSum += arr[x];

		}
		return -1;
	}
}
