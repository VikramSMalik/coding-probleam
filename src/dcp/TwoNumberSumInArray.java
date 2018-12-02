package dcp;

import java.util.HashMap;
import java.util.Map;

/**
 * This problem was recently asked by Google.
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k. 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 * 
 * @author vikram.singh
 *
 */
public class TwoNumberSumInArray {

	public static void main(String[] args) {
		int arr[]={10,15,-3,7};
		System.out.println(checkTwoNumerSumInArray(arr, 12));

	}

	public static boolean checkTwoNumerSumInArray(int arr[], int number) {

		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (Integer i : arr) {
			if (map.get(i)!=null) {
				return true;
			} else {
				map.put(number - i, true);
			}
		}
		return false;
	}

}
