package dcp;

/**
 * This problem was asked by Facebook.
 * 
 * Given a list of integers, return the largest product that can be made by
 * multiplying any three integers.
 * 
 * For example, if the list is [-10, -10, 5, 2], we should return 500, since
 * that's -10 * -10 * 5.
 * 
 * You can assume the list has at least three integers.
 * 
 * @author vikram.singh
 *
 */

public class TripletMaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10, 3, 5, 6, 20
		int arr[] = { -10, -10, 5, 2 };
		System.out.println(maxProduct(arr));
	}

	public static int maxProduct(int[] arr) {
		int result = 0;
		int min1 = arr[0], min2 = arr[1], max1 = arr[0], max2 = arr[1], max3 = arr[2];
		for (Integer a : arr) {
			if (min1 > a || min2 > a) {
				min2 = min1;
				min1 = a;
			}
			if (a > max1 || a > max3 || a > max2) {
				max3 = max2;
				max2 = max1;
				max1 = a;

			}
		}
		int max = max1 > max2 ? max1 > max3 ? max1 : max3 : max2 > max3 ? max2
				: max3;
		result = min1 * min2 * max > max1 * max2 * max3 ? min1 * min2 * max
				: max1 * max2 * max3;
		return result;
	}

}
