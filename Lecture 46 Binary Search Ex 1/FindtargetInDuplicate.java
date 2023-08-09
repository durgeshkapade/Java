// use Binary Search..................
//find the index of target in Duplicate rotated Sorted array 
// [1 ,1 ,1 ,1 ,2 ,3 ,1 ,1]  target=2 --------->    index is 4
//24-6-23
public class FindtargetInDuplicate {

	static int FindMinimum(int arr[], int target) {

		int n = arr.length;
		int st = 0, end = n - 1;

		while (st <= end) {

			int mid = st + (end - st) / 2;

			if (target == arr[mid]) {
				return mid;
			}else if(arr[st]==arr[mid]  &&arr[mid]==arr[end]){
				st++;
				end--;
			}else {
				if (arr[mid] <= arr[end]) {          //mid to end is sorted
					if (target >= arr[mid] && target <= arr[end]) {
						st = mid + 1;
					} else {
						end = mid - 1;
					}
				} else {                        // st to mid is sorted
					if (target >= arr[st] && target <= arr[mid]) {
						end = mid - 1;
					} else {
						st = mid + 1;
					}
				}
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1 ,1 ,1 ,1 ,2 ,3 ,1 ,1 };
		int target = 1;

		if (FindMinimum(arr, target) == -1) {
			System.out.println("The element doesn't exit");
		} else {
			System.out.println(FindMinimum(arr, target));
		}
	}

}
