import java.util.Scanner;

public class Print_nto1 {

    static void print(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;

        }
        //self work
        System.out.println(n);
        
        //recursive work
        print(n-1);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n ");
        int n=sc.nextInt();

        print(n);


    }
    
    
}
