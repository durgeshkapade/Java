import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number");
        int n=sc.nextInt();
        int p=0,s=1,ans=0;
        while(p<=n)
        {
            System.out.println(p);
            ans=p+s;
            p=s;
            s=ans;
        }

    }
}