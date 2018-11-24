package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		quickSort(arr, 0, arr.length - 1);
		for (Integer e : arr) {
			System.out.println(e);
		}

	}

	public static void quickSort(int arr[], int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h);
			quickSort(arr, l, p);
			quickSort(arr, p + 1, h);
		}

	}

	public static int partition(int arr[], int l, int h) {
		int pviot = arr[l];
		int i = l;
		int j = h;

		while (i < j) {
			while (i <= h && arr[i] <= pviot) {
				i++;
			}
			while (j >= l && arr[j] > pviot) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}

		}
		swap(arr, l, j);
		return j;
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
