//insertion sort  8 6 9 4 7  ------>  4 6 7 8 9 
//10-6-23
public class insertionSort {
	

	static void search(int arr[]){
		int n=arr.length;

		for (int i = 1; i < n; i++) {

			int j=i;
			while( j > 0 &&  arr[j] < arr[j-1]){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}

		}		
	}

	public static void main(String[] args) {

		
		int []arr={8,5,3,7,9,4};

		  search(arr);

		  for (int i : arr) {
			System.out.print(i+" ");
		  }


	}
	
}
