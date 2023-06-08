//3-2-2023 TO find kth smallest and kth largest number in Array
import java.util.*;
public class smallAndLarNo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        int p=sc.nextInt();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
       
  
        int []arr=new int[n];
  
        System.out.println("Entre the "+n+" element");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(p==arr[i])
            {
                if(i==0)
                  System.out.println("The number " + p+"  is smallest");
                else
                   System.out.println("The number " + p+ " is "+i+" smallest");
                   
            }
            
        }
        int s=1;
        for (int i = 0; i < arr.length; i++) {
            if(p==arr[i])
            {
                if(i==arr.length-1)
                  System.out.println("The number " + p+"  is largest");
                else
                   System.out.println("The number " + p+" is "+(n-s)+" Largest");
                   
            }
            s++;
        }

       


  
    }
    
}
