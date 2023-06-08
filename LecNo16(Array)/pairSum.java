//3-2-2023 to find the numeber of pair whose sum is equal to target 
import java.util.*;
public class pairSum{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
  
        int []arr=new int[n];
  
        System.out.println("Entre the "+n+" element");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }
  
        System.out.println("Enter the targest sum");
        int t=sc.nextInt();
        int ans=0;
        for ( int i = 0; i < arr.length; i++) {
            
            for ( int j=i+1; j < arr.length; j++) {
                if(t==arr[i]+arr[j])
                {
                    ans++;
                }
                
            }
        }

        System.out.println("the no of pair is "+ans);
    }
}