//5-2-2023 To Find prafix sum of all element in array
import java.util.*;
public class prefixSumArray {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=var.nextInt();

         int []arr=new int[n];

        System.out.println("Entre the "+n+" element");
         for (int i = 0; i < arr.length; i++) {
             arr[i]=var.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }

        System.out.println("The prefix sum is ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    
}

