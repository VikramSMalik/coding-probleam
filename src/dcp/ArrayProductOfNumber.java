package dcp;

/**
 * This problem was asked by Uber. Given an array of integers, return a new
 * array such that each element at index i of the new array is the product of
 * all the numbers in the original array except the one at i. For example, if
 * our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30,
 * 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 * 
 * @author vikram.singh
 *
 */
public class ArrayProductOfNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		productOfArrayElements(arr);
		productOfArrayElementsWithDivide(arr);
	}

	public static void productOfArrayElements(int[] arr) {
		int allnumProduct = 1;
		for (Integer i : arr) {
			allnumProduct *= i;
		}
		int a[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = allnumProduct / arr[i];
		}
		for (Integer i : a) {
			System.out.println(i);
		}
	}

	public static void productOfArrayElementsWithDivide(int[] arr) {
		int allnumProduct = 1;
		for (Integer i : arr) {
			allnumProduct *= i;
		}
		int a[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = divide(allnumProduct, arr[i]);
		}
		for (Integer i : a) {
			System.out.println(i);
		}
	}

	public static int divide(int a, int b) {
		int result = 0;
		while (a >= b) {
			a = a - b;
			result++;
		}
		return result;
	}

}
