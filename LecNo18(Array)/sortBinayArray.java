
import java.util.*;
public class sortBinayArray{
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=var.nextInt();

         int []arr=new int[n];

        System.out.println("Entre the "+n+" element");
         for (int i = 0; i < arr.length; i++) {
             arr[i]=var.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("After sort binary array");
        for (int i = 0; i < count; i++) {
            System.out.print("0 ");
        }
        for (int i = count; i < arr.length; i++) {
            System.out.print("1 ");
        }
        
    }
}