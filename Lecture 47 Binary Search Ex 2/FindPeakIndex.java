// use Binary Search..................
//find the index of highest element in the array 
//   input{0,1,2,3,5,4,2,1}       output  4
//15-6-23
public class FindPeakIndex {
    static int peakIndexInMountainArray(int[] arr) {

        int n=arr.length;
        int st=0,end=n-1;

        int ans=0;

        while(st<=end){

            int mid= st + (end - st)/2;


            if(arr[mid] < arr[mid+1]){
                st=mid+1;
                ans=mid+1;
            }else{
                end=mid-1;
            }
        }
        
       return ans;
        
    }

	public static void main(String[] args) {

		int arr[]={0,1,2,3,5,4,2,1};
		
		System.out.println(  peakIndexInMountainArray(arr));

	}
}