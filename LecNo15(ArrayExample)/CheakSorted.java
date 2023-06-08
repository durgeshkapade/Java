import java.util.Scanner;
public class CheakSorted {
    public static void main(String[] args) {
        int p=0,t=0;

        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=sc.nextInt();

      int []arr=new int[n];

      System.out.println("Entre the "+n+" element");
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
      }

       for (int i = 0; i < arr.length; i++) 
       {
          if (arr[i]>=p) {
            p=arr[i];
          }
          else{
            System.out.println("The array is not sorted");
            t++;
            break;
          }
       }

        if(t==0)
        {System.out.println("The array is sorted");}

        // boolean cheak=true;
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i]<arr[i-1])
        //     {
        //         cheak=false;
        //         break;  
        //     } 
        // }
        // System.out.println("Is Sorted : "+cheak);


    }
    
}
