//Radix sort  3 2 4 1 ------>  1 2 3 4
//15-6-23

public class RadixSort {

	static int findmax(int []arr){
		int p=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>p)  p=arr[i];
		}
		return p;
	}

	static void CountSort(int []arr, int place){
		int n=arr.length;
		int freq[]=new int[10];        /*create a frequency array of size greatest element in array i.e 9 
		                                   and it is also greatest element from 0 to 9    */
	                                                    
		for (int i = 0; i < arr.length; i++) {

			int idx=(arr[i]/place)%10;         //  809/10= 80     80 % 10 = 0
			freq[idx]++;                       //check the main array number 
		}                                        //and increase frequency array

//create a prefix sum array
		for (int i = 1; i < freq.length; i++) {     
			freq[i]=freq[i]+freq[i-1];
		}

		int output[]=new int[n];

		for (int i = n-1; i>=0; i--) {

			int digit=(arr[i]/place)%10;     //suppose  802   (802/1) % 10 = 2    fre[2] =7    

			output[freq[digit]-1]=arr[i];     //  output[6] =802

			freq[digit]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i]=output[i];
		}

	}

    static void RadixSort(int []arr){

		int max=findmax(arr);
	
		for (int place=1; max/place>0; place*=10) {
			CountSort(arr,place);
		}
	}

	public static void main(String[] args) {
		int arr[]={170,45,75,90,802,2,99,67,34,0,1,1};

		RadixSort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
