//Last Occernce of element present in array
import java.util.Scanner;
public class LastOccurence {
    public static void main(String[] args) {
        

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int s=-1,n=sc.nextInt();

      int []arr=new int[n];

      System.out.println("Entre the "+n+" element");
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
      }

      System.out.println("Enter X");
      int x=sc.nextInt();

      for (int i = 0; i < arr.length; i++) {
          if(arr[i]==x)
          s=i;
      }
      System.out.println("the last occurence of "+x+" presnt at index "+s+"");

    }
    
}
