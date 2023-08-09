// use Binary Search..................
//find the index of minimum number in rotated array 
//   input [5, 6, 7, 8, 1, 2, 3, 4]        output  4
//18-6-23
public class FindIndexOfMinim {

	static int FindMinimum(int arr[]){

		int n=arr.length;
		int st=0,end=n-1;
		int ans=-1;

		while(st<=end){
		
			int mid=st +(end-st)/2;
			
			if(arr[mid]>arr[n-1]){
				st=mid+1;				
			}else{
				end=mid-1;
				ans=mid;
			}
		}

		return ans;

	}
	public static void main(String[] args) {
		
		int arr[]={5, 6, 7, 8, 1, 2, 3, 4 };

		System.out.println(FindMinimum(arr));
	}
	
}
