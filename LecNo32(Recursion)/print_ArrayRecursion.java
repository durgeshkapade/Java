import java.util.Scanner;
public class print_ArrayRecursion{

        static void arr(int arr[],int index){
            if(index==arr.length)  return;
 
            System.out.print(arr[index]+" ");

            arr(arr,index+1);
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
        
        int index=0;
        arr(arr,index);
        
    }
}