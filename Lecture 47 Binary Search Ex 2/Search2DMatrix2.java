// use Binary Search..................
//find the index of the target in 2D array  (not in increasing order) 
//    but rows wise and columns wise increasing....... 
//   input [5, 6, 7, 8, 1, 2, 3, 4]        output  4
//18-6-23
public class Search2DMatrix2 {

	static Boolean FindTarget2DMatrix(int[][] arr, int target) {

		// n= no of rows m=no of columns
		int n = arr.length, m = arr[0].length;

		int i = 0, j = m - 1;

		while (i < n && j >= 0) {
			int Ele = arr[i][j];

				if (target == Ele) {
					return true;
				} else if (target < Ele) {
					j--;     // move left
				} else {
					i++;     // move down
				}

		}
		return false;

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 } };
		int target = 2;
		System.out.println(FindTarget2DMatrix(arr, target));
		;
	}
}
