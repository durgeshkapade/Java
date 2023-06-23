  //24-02-23  Program to print ones times of repeating element
import java.util.*;
class RemoveRepeatedElement{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Entre the "+n+" Element");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        
        int []freq=new int[10000];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]=freq[arr[i]]+1;
        }

        System.out.println("After removing Repeated Element one's times ");

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0){
                System.out.print(i+" ");
            }
        }


    }
}  
    

