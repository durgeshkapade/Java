// Binary Search..................
//find target is present or not in sorted array
//16-6-23
//  [ 2, 4, 6, 8, 12, 45, 78, 89 ]  target=45      ---->   true

public class FindTarget {

// Using Recursion

	static boolean RecurBinarysearch(int arr[], int st, int end, int target) {
		// base case
		if (st > end)
			return false;

		int mid = (st + end) / 2;

		if (target == arr[mid]) {
			return true;
		} else if (target < arr[mid]) {
			return RecurBinarysearch(arr, st, mid - 1, target); // self work
		} else {
			return RecurBinarysearch(arr, mid + 1, end, target); // self work
		}

	}
// Using Binary Search
	static boolean Search(int[] arr, int target) {
		int st = 0;
		int end = arr.length;
		while (st <= end) {
			int mid = (st + end) / 2;
			if (target == arr[mid]) {
				return true;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 12, 45, 78, 89 };

		int target = 2;

		System.out.println(Search(arr, target));
		System.out.println(RecurBinarysearch(arr, 0, arr.length - 1, target));

	}

}
