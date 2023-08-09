//A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.     nums[-1] = nums[n] = -∞
//  {1,2,1,3,4,6,5}  ---->  output  1 or 5
//15-6-23
public class FindPeakElement2 {

    static  int PeakElement(int[] arr) {
        
        int n=arr.length;
        int st=0,end=n-1;

        while(st<=end){
           int mid= st + (end - st)/2;

            if((mid==0 || arr[mid] > arr[mid-1])   && ( mid==n-1 || arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                st=mid+1;
            }else{
                end=mid-1;
            }

        }
        
       return -1;
    }

	public static void main(String[] args) {

		int arr[]={1,2,1,3,4,6,5};
		
		System.out.println(PeakElement(arr));
	}
}
