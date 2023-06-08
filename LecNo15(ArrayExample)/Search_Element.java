import java.util.Scanner;
// To search how many time the element(no)are present in array
public class Search_Element {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=sc.nextInt();

      int []arr=new int[n];

      System.out.println("Entre the "+n+" element");
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
      }

      System.out.println("Enter X");
      int p=sc.nextInt();
      
      int a=0;
      for (int i = 0; i < arr.length; i++) 
      {
             if(p==arr[i])
             {
                a=a+1;
             }
      }

        System.out.println("the Element "+p+"  presnt "+a+" Times");

    }
    
}
