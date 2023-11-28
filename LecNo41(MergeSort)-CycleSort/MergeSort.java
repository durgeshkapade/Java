//Merge sort  8 2 1 4 7  ------>  1 2 4 7 8
//13-6-23

public class MergeSort {

	static void Merge(int arr[], int l, int mid, int r) {

		int n1 = mid - l + 1;
		int n2 = r - mid;

		int left[] = new int[n1];
		int right[] = new int[n2];

		// copied array

		for (int i = 0; i < n1; i++)
			left[i] = arr[l + i];
		for (int j = 0; j < n2; j++)
			right[j] = arr[mid + 1 + j];

		// merge it

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {

			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}

		}

		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}
	}

	static void mergesort(int[] arr, int l, int r) {

		// base case
		if (l >= r) {
			return;
		}
		       int mid = (l + r) / 2;

		// Recursive work
		mergesort(arr, l, mid); // it sort 0 t0 half
		mergesort(arr, mid + 1, r); // it sort half to full

		//Self Work
		Merge(arr, l, mid, r); // then merge this two sorted array
	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 8, 6, 2, 1, 4 };

		int n = arr.length;
		mergesort(arr, 0, n - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}