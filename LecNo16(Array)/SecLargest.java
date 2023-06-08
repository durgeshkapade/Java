//3-2-2023 program to finding second largest number  0R   find first reapeating Number
import java.util.*;
public class SecLargest {

    static int ReapeatingNumber(int [] arr){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                    
                }
                
            }
            
            
        }
     
        return -1;
    }



    static int max(int arr[]){
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        
        return min;
    }

    static int min(int arr[])
    {
        int mx=max(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==mx)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
       
        int secMax=max(arr);
        return secMax;
        
    } 


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
  
        int []arr=new int[n];
  
        System.out.println("Entre the "+n+" element");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }

       System.out.println("the second largest element is "+min(arr));

      // System.out.println("The first reapeating Nmumber is  "+ReapeatingNumber(arr));//to find first reapeating Number
    }
    
}
