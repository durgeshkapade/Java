//20-03-2023
//num=5  k=4
// 5 10 15 20.........find mutiple of num k times..
import java.util.*;
public class FindmMltiple {

    static void multiple(int num,int k){
        //base case
        if(k==0)
            return ;

        //recursive work    
        multiple(num,(k-1));   
        // self work
        System.out.print(num*k+" ");

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number and their multiple");
        int num=sc.nextInt();
        int k=sc.nextInt();

        multiple(num,k);

    }
    
}
