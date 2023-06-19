//6-2-2023 To Find sum of two sub array are equal or not
import java.util.*;
public class AddOfTwoSubArray {

    static int[] PrefixSum(int []arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
            }
        return arr;
    }

    static int [] Suffixsum(int []arr){
        for (int i = arr.length-2; i >=0; i--) {
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }


    public static void main(String[] args) {
        boolean p=false;
        
        Scanner var = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=var.nextInt();

         int []arr=new int[n];

        System.out.println("Entre the "+n+" element");
         for (int i = 0; i <n; i++) {
             arr[i]=var.nextInt();
        }
        int ss[]=arr.clone();//because Refrence adderess are copy ...we make prefix 
                            //and suffix is made by using prefix not arr..

        int []pre=PrefixSum(arr);
        int []suf=Suffixsum(ss);
        

        for (int i = 0; i < pre.length-1; i++) {  //suf[i+1] will be out of bounce
            if(pre[i]==suf[i+1])                  // that way i will use (length-1)   
            { p=true;
              break;}
        }

        System.out.println("The Given Array is = "+p);


    }
}
