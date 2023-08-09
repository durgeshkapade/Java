// use Binary Search..................
//find the index of the target in 2D array  (increasing order)
//   {{1,3,5,7},{10,11,16,20},{23,30,34,60}}    target=5  ----> true
//15-6-23
public class Search2DMatrix {

	static boolean target(int [][]arr, int target){

		// n= no of rows m= no of coloums

		int n=arr.length,m=arr[0].length;

		int st=0,end=n*m-1;

		while(st<=end){
			int mid =st +(end-st)/2;
			int midEle=arr[mid/m][mid%m];

			if(target==midEle)  return true;

			if(target<midEle){
				end=mid-1;
			}else{
				st=mid+1;
			}
			

		}

		return false;

	}
	public static void main(String[] args) {

		int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=20;
		
		System.out.println(target(arr,target));;
		
	}
	
}
