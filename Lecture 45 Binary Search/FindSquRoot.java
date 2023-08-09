// use Binary Search..................
//find perfect square root of number....... 
// input 25  output 5     input = 24  output=4.83=4
//16-6-23
public class FindSquRoot {

	static int findRoot(int no) {

		int st = 0;
		int end = no;
		int ans = -1;

		while (st <= end) {
			int mid = st + (end - st) / 2;

			int val = mid * mid;

			if(val==no){
				return mid;
			}else if(val<no){
				st = mid + 1;
				ans = mid;
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int no = 24;

		System.out.println(findRoot(no));
	}
}