import java.util.*;
public class RectangleSum {

    static void sum(int [][]a,int l1,int r1,int l2, int r2){
        int sum=0;
        for (int i =l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum+=a[i][j];
                
            }
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows and coloums of fist matix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int [r][c];
        System.out.println("enter the first "+r*c+" Element");
            for (int i = 0; i < r; i++) 
          {
            for (int j = 0; j < c; j++) 
            {
                a[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter the l1 and r1");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("Enter the l2 and r2");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
         
        sum(a,l1,r1,l2,r2);
        
    }
    
}
