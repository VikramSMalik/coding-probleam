package sorting;

public class MyQuickSort {

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);

		}

	}

	public static int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pVal = arr[end];
		while (start < end) {

			if (arr[start] < pVal) {
				int temp = arr[start];
				arr[start] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
			start++;

		}
		int temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 3 };
		quickSort(arr, 0, arr.length - 1);
		for (Integer e : arr) {
			System.out.println(e);
		}

	}

}
