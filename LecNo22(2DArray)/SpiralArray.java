import java.util.*;
public class SpiralArray {

    static void Spiral(int [][]arr, int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int total=0;

        while(total<r*c){
            //top row= left col --- rihgt col
            for (int j = leftcol; j <= rightcol && total<r*c; j++) {
                System.out.print(arr[toprow][j]+" ");
                
                total++;
            }
            toprow++;
             
            //right coloumn=top row ---bottom row
            for (int i = toprow; i <= bottomrow && total<r*c; i++) {
                System.out.print(arr[i][rightcol]+" ");
                
                total++;
            }
            rightcol--;

            //bottom row =right col----left col
            for (int j = rightcol; j >= leftcol &&total<r*c; j--) {
                System.out.print(arr[bottomrow][j]+" ");
               
                total++;
            }
            bottomrow--;

            //left col= bottom row -----top row
            for (int i = bottomrow; i >= toprow && total<r*c; i--) {
                System.out.print(arr[i][leftcol]+" ");
                
                total++;
            }
            leftcol++;

            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Rows and coloums of fist matix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int [r][c];
        System.out.println("enter the Matrix "+r*c+" Element");
            for (int i = 0; i < r; i++) 
          {
            for (int j = 0; j < c; j++) 
            {
                a[i][j]=sc.nextInt();
                
            }
        }

        Spiral(a,r,c);
        
    }
    
}
