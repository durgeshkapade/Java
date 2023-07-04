import java.util.Scanner;

public class Factorial {

        static int Fac(int n){

            if(n==0)
            {
                return 1;
            }
            
            return n*Fac(n-1);
        }

    //public int sum=1;

    //  int Fac(int n){
        
    //     if(n==1){
    //         return 1;
    //     }

    //     sum=sum*n;
    //     Fac(n-1);

    //     return sum;
    // }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial f=new Factorial();
         int sum=1;

        System.out.println("Enter the n ");
        int n=sc.nextInt();

        sum=f.Fac(n);

        System.out.println("Factorial of  "+n);
        System.out.println(sum);

    }
    
}

