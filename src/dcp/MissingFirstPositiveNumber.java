package dcp;

/**
 * This problem was asked by Stripe. Given an array of integers, find the first
 * missing positive integer in linear time and constant space. In other words,
 * find the lowest positive integer that does not exist in the array. The array
 * can contain duplicates and negative numbers as well. For example, the input
 * [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3. You can
 * modify the input array in-place.
 * 
 * @author vikram.singh
 *
 */

public class MissingFirstPositiveNumber {

	public static void main(String[] args) {

		int arr[] = { 3, 4, -1, 1 };
		System.out.println(findMissingNumber(arr));

	}

	public static int findMissingNumber(int a[]) {
		int l = a.length;
		int i = 0;
		while (i < l) {

			if (a[i] > 0 && a[i] < l) {

				if (a[i] != i + 1 && a[a[i] - 1] != a[i]) {
					int temp = a[i];
					a[i] = a[a[i] - 1];
					a[temp - 1] = temp;
					i--;
				}
			}
			i++;
		}
		for (int j = 0; j < l; j++) {
			if (a[j] != j + 1) {
				return j + 1;
			}
		}
		return l;

	}

}
