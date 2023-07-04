import java.util.*;

public class SumOfDigit {

    static int SOD(int n) {
        // base case
        if (n >= 0 && n <= 9) {
            return n;
        }

        // recursion work
        int startans = SOD(n / 10);

        // self work
        int ans = startans + SOD(n % 10);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number ");
        int n = sc.nextInt();
        int ans=SOD(n);
        System.out.println("Sum of number is  "+ans);
    }

}
