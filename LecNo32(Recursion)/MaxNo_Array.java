
import java.util.Scanner;

public class MaxNo_Array {

    static int arr(int p, int arr[], int i) {

        if (i == arr.length)
         {   return p;}

        if (arr[i] > p) {
            p = arr[i];
        }       
        
        return arr(p, arr, i+1);
    }

    static int max_array(int arr[],int index){  

        if(index==arr.length-1)
            {
                return arr[index];
            }

        int smallans=max_array(arr,index+1);

        return Math.max(arr[index],smallans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the  " + n + " element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // int p = arr[0];
        // int max = arr(p, arr, 1);

       int max=max_array(arr,0);

        System.out.println(max);
    }

}