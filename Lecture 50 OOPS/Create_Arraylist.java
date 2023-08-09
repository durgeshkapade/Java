// Create own Array list 
// 23-7-23 

import java.util.Arrays;

public class Create_Arraylist {

	public static class ArrayList {

		int[] arr = new int[5];
		int idx = 0;
		int size=0;

		public void add(int no) {
			if(size == arr.length) {
				int []brr= Arrays.copyOf(arr,arr.length*2);
				brr = new int[brr.length] ;
				arr=brr;
			}
			arr[idx] = no;
			idx++;
			size++;

		}

		public void set(int idx,int val){
			arr[idx]=val;
		}
	}

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add(2);
		arr.add(4);
		System.out.println(arr.size);
		arr.add(5);
		arr.add(6);

		arr.set(0,10);
	}
}
