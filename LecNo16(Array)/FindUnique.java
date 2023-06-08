// 3-2-2023 Program to find Unique(only one) element in array
//Code by Durgesh.....
import java.util.*;
public class FindUnique {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
  
        int []arr=new int[n];
  
        System.out.println("Entre the "+n+" element");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }
        int ans=0; 
        for ( int i = 0; i < arr.length; i++) {
            
            for ( int j=i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
                
            }
            

        }

        for (int i = 0; i< arr.length; i++) {
            if(arr[i]!=-1)
            {
                System.out.println("THe Unique is "+arr[i]);
            }
            
        }

        

    }
    
}

