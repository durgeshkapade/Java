import java.util.*;
public class FindPower {

    static int power(int p,int q){
        //base case
        if(q==0)
            return 1;
            
        // recursive work
        int smallans=power(p,q-1);

        // self work
        int ans=smallans*p;

        return ans;

    }
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the p and q ");
        int p=sc.nextInt();
        int q=sc.nextInt();

        int ans=power(p,q);
        System.out.println("The "+p+" Raised to "+q+" is " +ans);
    }
    
}
