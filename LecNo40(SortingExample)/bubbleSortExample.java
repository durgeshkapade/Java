//Bubble sort  8 0 0 4 7  ------>  8 4 7 0 0
//12-6-23
// if the    i  element is equal to 0
//   &     i+1 element is not equal to 0
//              then swap         (otherwise not)
public class bubbleSortExample {
	public static void main(String[] args) {
		 
		int a[]={0,0,3,0,0,4};


		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]==0  && a[j+1]!=0){

					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}


		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
