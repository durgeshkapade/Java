//Count sort  3 2 4 1 ------>  1 2 3 4
//15-6-23
// it is a Stable algorithm
public class CountSort1 {

	static void Sort(int []arr){
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)                      // find the max element
			 max=arr[i];
		}

		int freq[]=new int[max+1];              // create a frequency array of size max+1

		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;                       //check the main array number 
		}                                        //and increase frequency array

		/*
		     3 6  7 3  7 6 3    arr

			 0 1 2 3 4 5 6 7 8  frequency array 
		     0 0 0 3 0 0 2 2 0
		 */
//create a prefix sum array
		for (int i = 1; i < freq.length; i++) {     //0 0 0 3 3 3 5 7 7
			freq[i]=freq[i]+freq[i-1];
		}

		int output[]=new int[n];
/*  travel the original array from last 
 suppose there is 2 ,go to fre array at position 2  (there is 7  at position 2 of freq array
 then the position of 2 at output array is (7-1)=6 )
*/		
		for (int i = n-1; i >=0; i--) {
			int idx=freq[arr[i]]-1;

			output[idx]=arr[i];
			freq[arr[i]]--;

		}

// copy output array to original array
		for (int i = 0; i < arr.length; i++) {
			arr[i]=output[i];
		}


	}
	public static void main(String[] args) {
		
		int arr[]={2,4,7,8,9,2,4,5,9,2,4,1};

		Sort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
