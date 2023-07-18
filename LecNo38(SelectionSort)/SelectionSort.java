//Selection sort  8 6 9 4 7  ------>  4 6 7 8 9 
//9-6-23
public class SelectionSort {

	static void Sort(int []arr){

		for (int i = 0; i < arr.length-1; i++) {

			// find the minimum element from unsorted part of array
			int min_index=i;

			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_index]){
					//  find the minimum element and update its index
					min_index=j;
				}
			}
             // then swap the current element and number at min_index
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			
		}

	}

	public static void main(String[] args) {
		
		int []arr={ 7,5,9,3,2,6};

		Sort(arr);

		for(int a:arr){
			System.out.print(a +" ");
		}
		
	}
	
}
