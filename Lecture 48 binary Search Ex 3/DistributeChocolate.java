// use Binary Search..................
// Chocolate Distribution Ex     (or)      Books Allocation Ex
// {12,34,67,90}     NoOfStu = 2    ----->    output = 113  
//29-6-23
public class DistributeChocolate {

	static boolean isDistributionPossible(int a[], int m, int mxchocolateAllowed) {

		int NoOfStudent = 1;
		int choc = 0;

		for (int i = 0; i < a.length; i++) {

			if (choc + a[i] <= mxchocolateAllowed) {
				choc = choc + a[i];

			} else {
				NoOfStudent++;
				choc = a[i];
			}
		}

		if (NoOfStudent > m) {
			return false;
		} else {
			return true;
		}

	}

	static int distributeChocolate(int a[], int m) {

		if (a.length < m)
			return -1;

		int ans = 0, st = 1, end = (int) 1e9;

		while (st <= end) {

			int mid = st + (end - st) / 2;

			if (isDistributionPossible(a, m, mid)) { // check ans possible or not
				ans = mid;
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int a[] = { 5, 3, 1, 4, 2 }; // 6
		int NoOfStu = 3;

		System.out.println(distributeChocolate(a, NoOfStu));
	}

}
