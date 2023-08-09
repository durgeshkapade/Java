// use Binary Search..................
//find the first occurance 
// [ 2, 2, 2, 5, 5, 6, 6, 7, 7]  target=6 --------->    index is 5
//16-6-23
public class FindFirstOccurance {

	static int BinarySearch(int[] arr, int target) {
		int st = 0;
		int end = arr.length;

		int first_occu = -1;

		while (st <= end) {

			int mid = st + (end - st) / 2;  // it is same as  st + end/2   avoid for overflow   end=10^9

			if (target == arr[mid]) {
				first_occu = mid;
				end = mid - 1;          // for last occurance [st = mid + 1]

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return first_occu;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 5, 5, 6, 6, 7, 7 };

		int target = 6;

		System.out.printf("First Occurance of %d at index %d ", target, BinarySearch(arr, target));
	}
}