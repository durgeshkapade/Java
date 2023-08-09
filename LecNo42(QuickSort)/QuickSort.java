//Quick sort  3 2 4 1 ------>  1 2 3 4
//14-6-23

public class QuickSort {

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}


	static int partition(int arr[], int st, int end) {
		int pivot = arr[st];
		int count = 0;
		for (int i = st + 1; i <= end; i++) {
			if (arr[i] <= pivot)
				count++;
		}

		int pivot_index = st + count;

		// swap arr[st] and arr[pivot_index]
		swap(arr, st, pivot_index);

		int i = st, j = end;
		while (i < pivot_index && j > pivot_index) {
			while (arr[i] <= pivot)  i++;
			while (arr[j] > pivot)   j--;

			if (i < pivot_index && j > pivot_index) {
				swap(arr, i, j);
				i++;  j++;
			}
		}

		return pivot_index;
	}

	static void quicksort(int arr[], int st, int end) {

		if (st >= end)          //base case
			return;

		int pi = partition(arr, st, end);   //self work

		quicksort(arr, st, pi - 1);        //recursive work
		quicksort(arr, pi + 1, end);

	}

	public static void main(String[] args) {

		int[] arr = { 3, 5,9, 6, 2,7 ,4, 4 };

		int n = arr.length;
		quicksort(arr, 0, n - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}