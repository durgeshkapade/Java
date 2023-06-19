//6-2-2023 To Find the range of sum in an Array.....
import java.util.*;
public class UserInputPrefixSum{

    static void  Sum(int []arr ,int l,int r){
        int sum=0;
        for (int i = l; i <=r; i++) {
            sum=sum+arr[i];
        }
        System.out.println("The sum is "+sum);
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
       

        System.out.println("Enter the Number of Queris");
        int q=var.nextInt();
        while(q>=1)
        {
            System.out.println("Enter the Range");
            int l=var.nextInt();
            int r=var.nextInt();

            Sum(arr,l,r);
            q--;
        }


    }
}