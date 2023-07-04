import java.util.Scanner;

public class FibonacciSeries {

    static int Fibonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        //int n=sc.nextInt();

        // for (int i = 0; i<n ; i++) {
        //         System.out.println(Fibonacci(i));
        // }

        System.out.print(Fibonacci(7));
        
    }
    
}
