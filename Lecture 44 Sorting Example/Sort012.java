//sort the array   1 0 0 2 0 1 0 2 1 2  ------>  0 0 0 0 1 1 1 2 2 2  
//15-6-23
// It is find in linear time and space
public class Sort012 {
	
	static void swap(int []arr,int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	static void sort(int[]arr){

		int lw=0,mid=0,hi=arr.length-1;

		while(mid<=hi){
			if(arr[mid]==0){
				swap(arr, mid,lw);
				lw++;
				mid++;
			}else if(arr[mid]==1){
				mid++;
			}else{
				swap(arr,mid,hi);
				hi--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]={1,0,0,2,0,1,0,2,1,2};

		sort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
	}


}
