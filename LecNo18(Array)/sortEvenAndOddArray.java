//5-2-2023 short array all even at the begining and 
//            all odd at last. order not matter...
import java.util.*;
public class sortEvenAndOddArray {

    static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=var.nextInt();

         int []arr=new int[n];

        System.out.println("Entre the "+n+" element");
         for (int i = 0; i < arr.length; i++) {
             arr[i]=var.nextInt();
        }
 // Travaling array at a time(two pointer apporach)  time and space complexity     
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    
        System.out.println("After sorting even and odd part of Array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        
//This is another method to separate by two loops....
       // System.out.println("After sorting even and odd part of Array");
   
// this loop travel even part
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]%2==0){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
// this loop travel odd part
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]%2!=0){
        //         System.out.print(arr[i]+" ");
        //     }
        // }


    }
    
}
