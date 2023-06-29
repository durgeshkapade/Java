//10-2-2023  To Find sum of rectangle from matrix.[Efficient]
import java.util.Scanner;

public class rectangleSum_1 {

    static void PrefixSum(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                a[i][j] = a[i][j] + a[i][j - 1];
            }
        }

    }

    static void sum(int[][] a, int l1, int r1, int l2, int r2) {
        PrefixSum(a);
        int sum = 0;
        // r1 to r2 sum for row i.
        if (r1 >= 1)
            for (int i = l1; i <= l2; i++) {
                sum += a[i][r2] - a[i][r1 - 1];
            }
        else
            for (int i = l1; i <= l2; i++) {
                sum += a[i][r2] ;              // because r1=0  a[i][-1] Gives error
            }

        System.out.println("The sum is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows and coloums of fist matix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("enter the first " + r * c + " Element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        // l1 l2 are rows   r1 r2 are coloums ..
        System.out.println("Enter the l1 and r1");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter the l2 and r2");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        sum(a, l1, r1, l2, r2);

    }

}
