//6-2-2023 To Find sum of two sub array are equal or not(Efficiently This is important)
import java.util.*;
public class AddOfTwoSubArray_1 {
    // Find total sum
    static int totalSum(int []arr){
        int Totalsum=0;
        for (int i = 0; i < arr.length; i++) {
            Totalsum=Totalsum+arr[i];
        }
        return Totalsum;
    }

    static boolean subArray(int []arr){
        int Totalsum=totalSum(arr);
        int psum=0;
        for (int i = 0; i < arr.length; i++) {
            
            psum=psum+arr[i];
            int sufsum=Totalsum-psum;
            if(psum==sufsum){
                return true;
            }
            
        }
        return false;
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

        p=subArray(arr);
        System.out.println(p);

    }
}
