import java.util.*;
public class SortSqurOfArray {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int n=p.nextInt();

         int []arr=new int[n];

        System.out.println("Entre the "+n+" element");
         for (int i = 0; i < arr.length; i++) {
             arr[i]=p.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }


        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==i){
                    System.out.print(arr[j]+" ");
                }
            }
        }




    
    }    
    
}
