// Print indises where the element is present...
// 25/03/2023
import java.util.Scanner;
public class PrintIndex{

    static void FindElement(int []arr ,int index ,int x){
        //base case
        if(index==arr.length){
            return ;
        }
        //self work
        if(arr[index]==x){
            System.out.print(index+" ");
        }
        //Recursion work
        FindElement(arr, index+1, x);
    }

        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];

        System.out.println("Enter the  "+n+" element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element Which are Find ?");
        int x=sc.nextInt();

        System.out.println("Indises Where "+x+" is Present");
        FindElement(arr, 0, x);

      
    }

}