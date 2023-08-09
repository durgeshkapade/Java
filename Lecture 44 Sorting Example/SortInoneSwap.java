// sort  the array 3 7 5 6 4 8 9  ------>  3 4 5 6 7 8 9
// the array is sorted in increasing order except two swapped element 
//15-6-23
public class SortInoneSwap {

	static void swap(int []arr,int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
//-------------------------------------------------------------
	static void Sort1(int []arr){
	int x=-1,y=-1;
	 for (int i = 1; i < arr.length; i++) {
		if(arr[i-1]>arr[i]){
			if(x==-1){         // first conflict 
				x=i-1;
			}else{
				y=i;          // sec  conflict
			}
		}
	 }
		swap(arr, x,y);
	}
//------------------------------------------------------------
	static void Sort(int []arr){

		int ans[]=new int[2];
		int k=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1]>arr[i]){
				ans[k++]=i-1;
			}
		}
		swap(arr, ans[0],ans[1]+1);
	 }
//---------------------------------------------------------------
	public static void main(String[] args) {
				
		int arr[]={9,4,5,6,7,8,3};

		//Sort1(arr);     //mam
		Sort(arr);    //it give proper ans also give {2,1}

		for (int i : arr) {
			System.out.print(i+" ");
		}
	
	}
}
//