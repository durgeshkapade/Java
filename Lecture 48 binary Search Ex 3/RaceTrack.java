// use Binary Search..................
// Arrange the student on Race track  keeping max   of minimum distance betn two kids
// { 1, 2, 4, 8, 9 }    NoOfStu = 2    ----->    output = 2  
//5-7-23
public class RaceTrack {

	static boolean ispossible(int a[], int k,int dist){

		int kidsplaced=1;
		int lastKid=a[0];

		for(int i=1;i<a.length;i++){
			if(a[i]-lastKid >= dist){
				kidsplaced++;
				lastKid=a[i];
			}
		}
		return kidsplaced >= k;
	}


	static int racetrack(int a[], int k) {

		if (k > a.length)
			return -1;
		int ans = -1;
		int st = 1, end = (int) 1e9;

		while (st <= end) {
			int mid = st + (end - st) / 2;

			if (ispossible(a, k, mid)) {
				ans = mid;
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 8, 9 };       // 3
		int k = 3;

		System.out.println(racetrack(a, k));
		
	}

}


