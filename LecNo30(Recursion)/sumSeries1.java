//20-03-2023
//1-2+3-4+5-6+7..............find sum of this series
import java.util.*;
public class sumSeries1 {

    static int sumSeries1(int num){
        //base case
        if(num==0)
            return 0;

        if(num%2==0)
             return sumSeries1(num-1)-num;
        else
             return sumSeries1(num-1)+num;

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        System.out.println(sumSeries1(num));

    }
    
}

