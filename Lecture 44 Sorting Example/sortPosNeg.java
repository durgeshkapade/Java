//sort the array    19,-20,4,-3,-17,2,-34,8,-2  ------>  -2 -20 -34 -3 -17 2 4 8 19
// order not matter sort  last positive and first negative element 
//15-6-23
public class sortPosNeg {

	static void swap(int []arr,int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	static void partition(int[]arr){
		int i=0;
		int j=arr.length-1;

		while(i<=j){
			while(arr[i]<0)  i++;

			while(arr[j]>=0)  j--;

			if(i<=j){
			swap(arr,i,j); 
			i++;  j--;
		    }

		}

	}
	public static void main(String[] args) {
		int arr[]={19,-20,4,-3,-17,2,-34,8,-2};

		partition(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
