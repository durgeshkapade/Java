//Count sort  3 2 4 1 4------>  1 2 3 4 4
//15-6-23
// this is not stable algorithm that's way i will use another method
//    stabality(change the position of same Element)

public class CountSort {

	static void Sort(int []arr){
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)                      // find the max element
			 max=arr[i];
		}

		int fre[]=new int[max+1];              // create a frequency array of size max+1

		for (int i = 0; i < arr.length; i++) {
			fre[arr[i]]++;                       //check the main array number 
		}                                        //and increase frequency array

		/*
		     3 6  7 3  7 6 3    arr

			 0 1 2 3 4 5 6 7 8  frequency array 
		     0 0 0 3 0 0 2 2 0
		 */
		int k=0;
		for (int i = 0; i < fre.length; i++) {
			for (int j = 0; j < fre[i]; j++) {
				arr[k]=i;
				k++;
			}
		}
	}

	public static void main(String[] args) {
		
		int[]arr={3 , 4, 5,6,4,9,78, 66 , 78 ,2,33,45,9,3};

		Sort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
}
