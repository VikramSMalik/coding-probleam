package sorting;

public class MergeSort {

	public static void divide(int arr[]) {
		int l = arr.length;
		if (l > 1) {
			int m = l / 2;
			int[] leftArr = new int[m];
			int[] rightArr = new int[l - m];
			for (int i = 0; i < m; i++) {
				leftArr[i] = arr[i];
			}
			for (int i = m; i < l; i++) {
				rightArr[i - m] = arr[i];
			}
			divide(leftArr);
			divide(rightArr);
			merge(arr, leftArr, rightArr);

		}
	}

	public static void merge(int[] arr, int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0;
		int l = left.length;
		int r = right.length;

		while (i < l && j < r) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;

		}
		while (i < l) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		divide(arr);
		for (Integer e : arr) {
			System.out.println(e);
		}

	}

}
