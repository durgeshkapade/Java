////6-2-2023 To Find the range of sum of Array (Using Time and Space complexity)
import java.util.*;
public class UserInputPrefixSum_1 {

    static int[] PrefixSum(int []arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
            
        }
        return arr;
    }
    
    public static void main(String[] args) {
        
        Scanner var = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=var.nextInt();

         int []arr=new int[n+1];

        System.out.println("Entre the "+n+" element");
         for (int i = 1; i <=n; i++) {
             arr[i]=var.nextInt();
        }
       
        int [] pre=PrefixSum(arr);

        System.out.println("Enter the Number of Queris");
        int q=var.nextInt();

        while(q>=1)
        {
            System.out.println("Enter the Range");
            int l=var.nextInt();
            int r=var.nextInt();

            int ans=pre[r]-pre[l-1];

            System.out.println("The Sum is  "+ans);
            
            q--;
        }
    }

}
