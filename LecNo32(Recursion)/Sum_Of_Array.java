import java.util.Scanner;
public class Sum_Of_Array{

        static int arr(int arr[],int index){
            //base case
            if(index==arr.length)  
                  return 0;
            // recursive work      
            int smallans=arr(arr,index+1);
            // self work
            int sum=smallans+arr[index];

            return sum;
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

        int sum=arr(arr,0);
        System.out.println(sum);
        
    }
}