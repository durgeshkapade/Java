// Greatest common divider..
// x=hb16 = 1,2,4,8
// y=12 = 1,2,3,4,6
//CD= 1,2,4
//GCD=4
import java.util.*;
public class GCD {

    // best Apporach.........
    static int gcd(int x,int y){
        if(y==0)
           return x;

        return gcd(y , x % y);
    }

    // brute force apporach...........
    static void multiple(int p, int x, int y) {
        // base case
        if (x == 1) {
            System.out.println(x);
            return;
        }

        if (p % x == 0 && y % x == 0) {
            System.out.println(x);
            return;
        }

        multiple(p, (x - 1), y);

        return;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X and Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = x;

        multiple(p, x, y);

        System.out.println(gcd(x,y));;

    }
}
