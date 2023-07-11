import java.util.Scanner;
public class CheakElementPresentOrNot{

    static boolean FindElement(int []arr ,int index ,int x){
        //base case
        if(index==arr.length){
            return false;
        }
        //self work
        if(arr[index]==x){
            return true;
        }
        //Recursion work
        return FindElement(arr, index+1, x);
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

        if(FindElement(arr, 0, x)){
            System.out.println("Yes !!Found");
        }else{
            System.out.println("No  Found");
        }

      
    }

}